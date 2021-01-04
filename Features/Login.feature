Feature: Login

Scenario: Successful Login with Valid Credentials 

Given User Launch Chrome Browser 
When User Opens URL "https://admin-demo.nopcommerce.com/login"
And User enter Email as "admin@yourstore.com" and Password as "admin"
And Click on Login 
Then Page Title should be "Dashboard / nopCommerce administration"
When User Click on Logout link 
Then Page Title should be "Your store. Login"
And Close Browser 



Scenario Outline: Login Data Drivan

Given User Launch Chrome Browser 
When User Opens URL "https://admin-demo.nopcommerce.com/login"
And User enter Email as "<email>" and Password as "<password>"
And Click on Login 
Then Page Title should be "Dashboard / nopCommerce administration"
When User Click on Logout link 
Then Page Title should be "Your store. Login"
And Close Browser 

Examples:

        | email | |  password  |
        | admin@yourstore.com |  |  admin |
        | invalid@yourstore.com  |  |  invalid |