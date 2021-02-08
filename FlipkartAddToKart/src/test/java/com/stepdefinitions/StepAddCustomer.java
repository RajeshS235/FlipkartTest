package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjects.AddCustomer;
import cucumber.api.java.en.*;

public class StepAddCustomer {

	public AddCustomer add;
	public WebDriver driver;
	
	
	@Given("User Launch the browser")
	public void user_Launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\YourLogo\\Driver\\chromedriver.exe");
		driver  = new ChromeDriver();
	}
	
	@When("User Launch the url {string}")
	public void user_Launch_the_url(String url) {
	driver.get(url);
		add = new AddCustomer(driver);
	}
	
	
	@When("User login with valid username {string} and password {string}")
	public void user_login_with_valid_username_and_password(String user, String pass) {
		add.setUsername(user);
		add.setPassword(pass);
		add.userLogin();
	}

	@When("User in the Dashboard")
	public void user_in_the_Dashboard() {
		}

	@When("User click the More info and display the list of customer details")
	public void user_click_the_More_info_and_display_the_list_of_customer_details() {
	
	}

	@When("User click the Add new button and display the customer info")
	public void user_click_the_Add_new_button_and_display_the_customer_info() {
	
	}

	@When("User insert all the details and click save")
	public void user_insert_all_the_details_and_click_save() {
		}

	@Then("User display successfully message")
	public void user_display_successfully_message() {
	
	}


}
