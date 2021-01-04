Feature: Customers

 Background: Below are the common steps for every scenario
    Given User Launch Chrome Browser 
	When User Opens URL "https://admin-demo.nopcommerce.com/login" 
	And User enter Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
	Then User can view Dashboard 

Scenario: Add a new Customer 
	
	When User click on Customers Menu 
	And User clcik on Cutomers Menu Item 
	And Click on Add new button 
	Then User can view Add new Customer Page 
	When User enter Customers Info 
	And Click on Save button 
	Then User can view Confirmation message "The new customer has been added successfully." 
	And Close Browser 


Scenario: Search Customer by EmailID

	When User click on Customers Menu 
	And User clcik on Cutomers Menu Item 
	And Enter Customer Email 
	When Click on Search Button 
	Then User should found Email in the search table 
	And Close Browser 


Scenario: Search Customer by Name

	When User click on Customers Menu 
	And User clcik on Cutomers Menu Item 
	And Enter Customer FirstName 
	And Enter Customer LastName 
	When Click on Search Button 
	Then User should found Name in the search table 
	And Close Browser