package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class Steps extends BaseClass {
	
	@Before
	public void setup() throws IOException
	{
		// Added logger
		logger = Logger.getLogger("nopCommerce");
		PropertyConfigurator.configure("log4j.properties");
		
		//Reading Properties
		configProp=new Properties();
		FileInputStream configProfile = new FileInputStream("config.properties");
		configProp.load(configProfile);
		
		String br= configProp.getProperty("browser");
		
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
			driver = new ChromeDriver();
		}
		else if (br.equals("ie")) {
			System.setProperty("webdriver.gecko.driver", configProp.getProperty("iepath"));
			driver = new InternetExplorerDriver();
		}
		else if (br.equals("firefox")) {
			System.setProperty("webdriver.ie.driver", configProp.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		}

		logger.info("********* Launching browser ************");
	}

	@Given("User Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() {
		
		lp=new LoginPage(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User Opens URL {string}")
	public void user_Opens_URL(String url) {
		logger.info("********* Opening URL ************");
		driver.get("https://admin-demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	   
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_Email_as_and_Password_as(String email, String password) {
		logger.info("********* Providing Login details ************");
	    lp.setUserName(email);
	    lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_Login() throws InterruptedException {
		logger.info("********* Started login ************");
	    lp.clickLogin();
	    //Thread.sleep(3000);
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) throws InterruptedException {
	    if (driver.getPageSource().contains("Login was unsuccessful")) {
	    	driver.close();	
	    	logger.info("********* Login Passed ************");	
	    	Assert.assertTrue(false);}
	    	else {
	    		logger.info("********* Login Failed ************");
	    		Assert.assertEquals(title, driver.getTitle());
	    	}
	    //Thread.sleep(3000);
	    }

	@When("User Click on Logout link")
	public void user_Click_on_Logout_link() throws InterruptedException {
		logger.info("********* Click on Logout link ************");
	    lp.clickLogout();
	    //Thread.sleep(3000);
	}

	@Then("Close Browser")
	public void close_Browser() {
		logger.info("********* Closing browser ************");
	    driver.quit();
	}
	
	// Customer Feature Step Defination................................................
	
	@Then("User can view Dashboard")
	public void user_can_view_Dashboard() {
	    addCust = new AddCustomerPage(driver);
	    Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
	}

	@When("User click on Customers Menu")
	public void user_click_on_Customers_Menu() throws InterruptedException {
		//Thread.sleep(3000);
		addCust.clickOnCustomerMenu();
	}

	@When("User clcik on Cutomers Menu Item")
	public void user_clcik_on_Cutomers_Menu_Item() throws InterruptedException {
		//Thread.sleep(3000);
		addCust.clickOnCustomerMenuItem();
	}

	@When("Click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {
		addCust.clickOnAddNew();
		//Thread.sleep(3000);
	}

	@Then("User can view Add new Customer Page")
	public void user_can_view_Add_new_Customer_Page() {
	    Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("User enter Customers Info")
	public void user_enter_Customers_Info() throws InterruptedException {
		
		logger.info("********* Adding customer info ************");
		logger.info("********* Providing customer details ************");
		String email=randomString()+"@gmail.com";
		addCust.setEmail(email);
		addCust.setPassword("test123");
		addCust.setGender("Male");
		addCust.setFirstName("Chetan");
		addCust.setLastName("Kumar");
		addCust.setDob("7/05/1985");    // Format : D/MM/YYYY
		addCust.setCompanyName("busyQA");
		addCust.setAdminContent("This is for Automation Practice............");
		addCust.setCustomerRoles("Guests");
	}

	@When("Click on Save button")
	public void click_on_Save_button() throws InterruptedException {
		logger.info("********* Saving customer data ************");
		addCust.clickOnSave();
		//Thread.sleep(3000);
	}

	@Then("User can view Confirmation message {string}")
	public void user_can_view_Confirmation_message(String msg) {
	    Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
	    		.contains("The new customer has been added successfully."));
	}
	
	// Steps for Searching Customer by using EmailID.......................................
	
	@When("Enter Customer Email")
	public void enter_Customer_Email() {
		logger.info("********* Searching customer by Email id ************");
		searchCust=new SearchCustomerPage(driver);
		searchCust.setEmail("victoria_victoria@nopCommerce.com");
	    
	}

	@When("Click on Search Button")
	public void click_on_Search_Button() throws InterruptedException {
		searchCust.clickSearch();
		//Thread.sleep(3000);
	    
	}

	@Then("User should found Email in the search table")
	public void user_should_found_Email_in_the_search_table() {
		boolean status=searchCust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
		Assert.assertEquals(true, status);
	  
	}
	
	// Steps for Searching Customer by using FirstName and LastName.......................................
	
	@When("Enter Customer FirstName")
	public void enter_Customer_FirstName() {
		logger.info("********* Searching customer by Name ************");
		searchCust=new SearchCustomerPage(driver);
		searchCust.setFirstName("Victoria");
	    
	}

	@When("Enter Customer LastName")
	public void enter_Customer_LastName() {
		searchCust.setLastName("Terces");
	
	}

	@Then("User should found Name in the search table")
	public void user_should_found_Name_in_the_search_table() {
		boolean status=searchCust.searchCustomerByName("Victoria Terces");
		Assert.assertEquals(true, status);

	}


}
