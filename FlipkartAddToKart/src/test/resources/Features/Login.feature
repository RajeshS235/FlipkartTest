Feature: Login
Scenario: Successfull login with valid Crendentials
Given User Launch Chrome browser
When User open URL "https://www.amazon.in/"
And User Entered username "rajeshsv.1987@gmail.com" and password "raji@5924"
And User click the login button
Then Page title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
When User click logout button
And User close browser



