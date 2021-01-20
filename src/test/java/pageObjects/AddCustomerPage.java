package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitHelper;

public class AddCustomerPage {
public WebDriver ldriver;
WaitHelper waithelper;
	
	public AddCustomerPage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
}
    By lnkCustomers_menu = By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
    By lnkCustomers_menuitem = By.xpath("//span[@class='menu-item-title'] [contains(text(),'Customers')]");
    
    By btnAddNew = By.xpath("//a[@class='btn bg-blue']");
    
    By txtEmail = By.xpath("//input[@id='Email']");
    By txtPassword = By.xpath("//input[@id='Password']");
    
    By txtFirstName = By.xpath("//input[@id='FirstName']");
    By txtLastName = By.xpath("//input[@id='LastName']");
    
    By rdMaleGender = By.id("Gender_Male");
    By rdFemaleGender = By.id("Gender_Female");
    
    By txtDOB = By.xpath("//input[@id='DateOfBirth']");
    
    By txtCompanyName = By.xpath("//input[@id='Company']");
    
    By txtCustomerRoles = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
    
    //By txtCustomerRoles = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
   
    
    By lstItemAdministrators = By.xpath("//li[[contains(text(),'Administrators')]");
    By lstItemRegistered = By.xpath("//li[[contains(text(),'Registered')]");
    By lstItemGuests = By.xpath("//li[contains(text(),'Guests')]");
    By lstItemVendors = By.xpath("//li[[contains(text(),'Vendors')]");
    
    
    By drpMgrOfVendor = By.xpath("//*[@id='VendorId']");
    
    By txtAdminContent = By.xpath("//textarea[@id='AdminComment']");
    
    By btnSave = By.xpath("//button[@name='save']");
    
    // Action Methods
    
    public String getPageTitle() {
    	return ldriver.getTitle();
    }
    
    public void clickOnCustomerMenu() {
    	//waithelper.WaitForElement(lnkCustomers_menu, 5);
    	ldriver.findElement(lnkCustomers_menu).click();
    	
    }
   
    public void clickOnCustomerMenuItem() {
    	//waithelper.WaitForElement(lnkCustomers_menuitem, 5);
    	ldriver.findElement(lnkCustomers_menuitem).click();
    }
    
    public void clickOnAddNew() {
    	ldriver.findElement(btnAddNew).click();
    }
    
    public void setEmail(String email) {
    	ldriver.findElement(txtEmail).sendKeys(email);
    }
    
    public void setPassword(String password) {
    	ldriver.findElement(txtPassword).sendKeys(password);
    }
    
    public void setFirstName(String firstname) {
    	ldriver.findElement(txtFirstName).sendKeys(firstname);
    }
    
    public void setLastName(String lastname) {
    	ldriver.findElement(txtLastName).sendKeys(lastname);
    }
    
    public void setCustomerRoles(String role) throws InterruptedException {
    	if (!role.equals("Vendors")) {
    		ldriver.findElement(By.xpath("//*[@id='SelectedCustomerRoleIds_taglist']/li/span[2]")).click();
    	}
    		
    	//ldriver.findElement(txtCustomerRoles).click();
    	
    	WebElement listItem;
    	
    	//Thread.sleep(3000);
    	
    	if (role.equals("Administrators")) {
    		listItem=ldriver.findElement(lstItemAdministrators);
    	}
    	else if (role.equals("Registered")) {
    		listItem=ldriver.findElement(lstItemRegistered);
    	}
    	else if (role.equals("Guests")) {
    		listItem=ldriver.findElement(lstItemGuests);
    	}
    	else if (role.equals("Vendors")) {
    		listItem=ldriver.findElement(lstItemVendors);
    	}
    	else {
    		listItem=ldriver.findElement(lstItemGuests);
    	}
    	
    	//listItem.click();
    	
    	JavascriptExecutor js = (JavascriptExecutor)ldriver;
    	js.executeScript("arguments[0].click();", listItem);
    }
    
    public void setGender(String gender) {
    	
    	if (gender.equals("Male")) {
    		ldriver.findElement(rdMaleGender).click();
    	}
    	else if (gender.equals("Female")) {
    		ldriver.findElement(rdFemaleGender).click();
    	}
    	else  {
    		ldriver.findElement(rdMaleGender).click();//Default
    	}
    }
    
    public void setDob(String dob) {
    	ldriver.findElement(txtDOB).sendKeys(dob);
    }
    
    public void setCompanyName(String comname) {
    	ldriver.findElement(txtCompanyName).sendKeys(comname);
    }
    
    
    public void setManagerOfVendar(String value) {
    	
    	Select drp=new Select(ldriver.findElement(drpMgrOfVendor));
    	drp.selectByValue(value);
    }
    
    public void setAdminContent(String content) {
    	ldriver.findElement(txtAdminContent).sendKeys(content);
    }
    
    public void clickOnSave() {
    	ldriver.findElement(btnSave).click();
    }
    		
	
	
}
