package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	public WebDriver driverl;
	
	public LoginPageObjects(WebDriver driverr) {
	driverl = driverr;
	PageFactory.initElements(driverr, this);
	}
	
	
	@FindBy(xpath="//*[contains(text(),'Account & Lists')]")
	WebElement accounts;
	
	
	@FindBy(xpath="//*[@id='nav-flyout-ya-signin']/a/span")
	WebElement login;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continues;
	
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement passwords;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signin;
	
	@FindBy(xpath="//*[@id='nav-item-signout']/span")
	WebElement logout;

	
	public void moveToElement() {
		Actions action = new Actions(driverl);
		action.moveToElement(accounts).build().perform();
		action.moveToElement(login).build().perform();
		login.click();
	}
	public void setUsername(String usernames) {
		username.sendKeys(usernames);
	}
	
	public void clickContinue() {
		continues.click();
	}
	public void setPassword(String password) {
		passwords.sendKeys(password);
	}
	public void clickLogin() {
		login.click();
	}
	public void clickSignin() {
		signin.click();
	}

	public void logOut() {
		Actions action = new Actions(driverl);
		action.moveToElement(accounts).build().perform();
		action.moveToElement(logout).build().perform();
		logout.click();
	}
	
	
	
	
	
	
	
}
