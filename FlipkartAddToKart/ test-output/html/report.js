$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Customers.feature");
formatter.feature({
  "name": "New Customer Adding Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@customer"
    }
  ]
});
formatter.scenario({
  "name": "Add new Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@customer"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepAddCustomer.user_Launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Launch the url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepAddCustomer.user_Launch_the_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login with valid username \"admin@yourstore.com\" and password \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepAddCustomer.user_login_with_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User in the Dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "StepAddCustomer.user_in_the_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the More info and display the list of customer details",
  "keyword": "And "
});
formatter.match({
  "location": "StepAddCustomer.user_click_the_More_info_and_display_the_list_of_customer_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Add new button and display the customer info",
  "keyword": "And "
});
formatter.match({
  "location": "StepAddCustomer.user_click_the_Add_new_button_and_display_the_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User insert all the details and click save",
  "keyword": "And "
});
formatter.match({
  "location": "StepAddCustomer.user_insert_all_the_details_and_click_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User display successfully message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepAddCustomer.user_display_successfully_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});