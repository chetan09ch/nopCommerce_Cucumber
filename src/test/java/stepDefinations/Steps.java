package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class Steps extends BaseClass {

	@Given("User Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	    driver= new ChromeDriver();
	    
		lp=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User Opens URL {string}")
	public void user_Opens_URL(String url) {
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_Email_as_and_Password_as(String email, String password) {
	    lp.setUserName(email);
	    lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_Login() {
	    lp.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
	    if (driver.getPageSource().contains("Login was unsuccessful")) {
	    	driver.close();	
	    	Assert.assertTrue(false);}
	    	else {
	    		Assert.assertEquals(title, driver.getTitle());
	    	}
	    }

	@When("User Click on Logout link")
	public void user_Click_on_Logout_link() {
	    lp.clickLogout();
	}

	@Then("Close Browser")
	public void close_Browser() {
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
		Thread.sleep(3000);
		addCust.clickOnCustomerMenu();
	}

	@When("User clcik on Cutomers Menu Item")
	public void user_clcik_on_Cutomers_Menu_Item() throws InterruptedException {
		Thread.sleep(3000);
		addCust.clickOnCustomerMenuItem();
	}

	@When("Click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {
		addCust.clickOnAddNew();
		Thread.sleep(3000);
	}

	@Then("User can view Add new Customer Page")
	public void user_can_view_Add_new_Customer_Page() {
	    Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("User enter Customers Info")
	public void user_enter_Customers_Info() throws InterruptedException {
		String email=randomString()+"@gmail.com";
		addCust.setEmail(email);
		addCust.setPassword("test123");
		
		// Registered - Default
		// The Customer can not in both 'Guests' and 'Registered' Customer Role
		// Add the Customer to 'Guests' or 'Registered' Customer Role
		Thread.sleep(3000);
		addCust.setCustomerRoles("Guests");
		Thread.sleep(3000);
		
		addCust.setManagerOfVendar("Vendor 2");
		addCust.setGender("Male");
		addCust.setFirstName("Chetan");
		addCust.setLastName("Kumar");
		addCust.setDob("7/05/1985");    // Format : D/MM/YYYY
		addCust.setCompanyName("busyQA");
		addCust.setAdminContent("This is for Automation Practice............");
		
	}

	@When("Click on Save button")
	public void click_on_Save_button() throws InterruptedException {
		addCust.clickOnSave();
		Thread.sleep(3000);
	}

	@Then("User can view Confirmation message {string}")
	public void user_can_view_Confirmation_message(String msg) {
	    Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
	    		.contains("The new customer has been added successfully."));
	}
	
	// Steps for Searching Customer by using EmailID.......................................
	
	@When("Enter Customer Email")
	public void enter_Customer_Email() {
		searchCust=new SearchCustomerPage(driver);
		searchCust.setEmail("victoria_victoria@nopCommerce.com");
	    
	}

	@When("Click on Search Button")
	public void click_on_Search_Button() throws InterruptedException {
		searchCust.clickSearch();
		Thread.sleep(3000);
	    
	}

	@Then("User should found Email in the search table")
	public void user_should_found_Email_in_the_search_table() {
		boolean status=searchCust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
		Assert.assertEquals(true, status);
	  
	}
	
	// Steps for Searching Customer by using FirstName and LastName.......................................
	
	@When("Enter Customer FirstName")
	public void enter_Customer_FirstName() {
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
