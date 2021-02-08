package com.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjects.LoginPageObjects;

import cucumber.api.java.en.*;

public class TestLogin {

	public WebDriver driver;
	public LoginPageObjects lp;
	
	
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\YourLogo\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	}

	@When("User open URL {string}")
	public void user_open_URL(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User Entered username {string} and password {string}")
	public void user_Entered_username_and_password(String username, String password) {

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		lp = new LoginPageObjects(driver);
		
		lp.moveToElement();
		lp.setUsername(username);
		lp.clickContinue();
		lp.setPassword(password);
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		lp.clickSignin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title2) {
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		String title = driver.getTitle();
		
	}

	@When("User click logout button")
	public void user_click_logout_button() {
		driver.navigate().refresh();
		lp.logOut();
		String title1 = driver.getTitle();
		System.out.println(title1);
	}

	@When("User close browser")
	public void user_close_browser() {
		driver.close();
	}


	
}
