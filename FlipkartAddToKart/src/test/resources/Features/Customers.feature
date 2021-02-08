
@customer
Feature: New Customer Adding Feature

Scenario: Add new Customer

Given User Launch the browser
When User Launch the url "https://admin-demo.nopcommerce.com/login"
When User login with valid username "admin@yourstore.com" and password "admin"
And User in the Dashboard
And User click the More info and display the list of customer details
And User click the Add new button and display the customer info
And User insert all the details and click save
Then User display successfully message



