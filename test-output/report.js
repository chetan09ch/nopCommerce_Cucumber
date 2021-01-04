$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customers.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for every scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_Opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on Customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_Customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clcik on Cutomers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clcik_on_Cutomers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Add new Customer Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Add_new_Customer_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Customers Info",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enter_Customers_Info()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with value: Vendor 2\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027XIPL0505\u0027, ip: \u0027192.168.10.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.findOptionsByValue(Select.java:283)\r\n\tat org.openqa.selenium.support.ui.Select.selectByValue(Select.java:186)\r\n\tat pageObjects.AddCustomerPage.setManagerOfVendar(AddCustomerPage.java:142)\r\n\tat stepDefinations.Steps.user_enter_Customers_Info(Steps.java:111)\r\n\tat ✽.User enter Customers Info(file:Features/Customers.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view Confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Confirmation_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Below are the common steps for every scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_Opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer by EmailID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on Customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_Customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clcik on Cutomers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clcik_on_Cutomers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Customer Email",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Customer_Email()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat java.util.Objects.requireNonNull(Objects.java:203)\r\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:106)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:85)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:45)\r\n\tat utilities.WaitHelper.WaitForElement(WaitHelper.java:17)\r\n\tat pageObjects.SearchCustomerPage.setEmail(SearchCustomerPage.java:64)\r\n\tat stepDefinations.Steps.enter_Customer_Email(Steps.java:138)\r\n\tat ✽.Enter Customer Email(file:Features/Customers.feature:26)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on Search Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should found Email in the search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_found_Email_in_the_search_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_Browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Below are the common steps for every scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_Opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d87.0.4280.88)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027XIPL0505\u0027, ip: \u0027192.168.10.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\CCHOUD~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:63308}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 93cca337d9b377576d47f7a591d3725f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:281)\r\n\tat pageObjects.AddCustomerPage.getPageTitle(AddCustomerPage.java:54)\r\n\tat stepDefinations.Steps.user_can_view_Dashboard(Steps.java:72)\r\n\tat ✽.User can view Dashboard(file:Features/Customers.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Search Customer by Name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on Customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_Customers_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clcik on Cutomers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clcik_on_Cutomers_Menu_Item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Customer FirstName",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Customer_FirstName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Customer LastName",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_Customer_LastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Search Button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should found Name in the search table",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_found_Name_in_the_search_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_Browser()"
});
formatter.result({
  "status": "skipped"
});
});