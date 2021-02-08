package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {

	public WebDriver driverl;
	
	WaitforElement waitElements;
	
	public AddCustomer(WebDriver driverr) {
		driverl= driverr;
		PageFactory.initElements(driverr, this);
		waitElements= new WaitforElement(driverl);
	}
	@FindBy(xpath="//*[@id='Email']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement login;
	
	
	@FindBy(xpath="//*[@id=\"nopcommerce-common-statistics-box\"]/div[2]/div[3]/div/a")
	WebElement moreinfo;
	
	
	@FindBy(xpath="//*[@class='fa fa-plus-square']")
	WebElement addNew;
	
	@FindBy(id="Email")
	WebElement newemail;
	
	@FindBy(id="Password")
	WebElement newpassword;
	
	
	@FindBy(id="FirstName")
	WebElement firstName;

	@FindBy(id="LastName")
	WebElement lastName;

	@FindBy(id="Gender_Male")
	WebElement genderMale;
	
	@FindBy(id="Gender_Female")
	WebElement genderFemale;
	
	@FindBy(id="DateOfBirth")
	WebElement dob;
	
	@FindBy(id="Company")
	WebElement company;
	
	@FindBy(id="IsTaxExempt")
	WebElement isTaxExempt;
	
	@FindBy(xpath="//*[@id=\"customer-info\"]/div[2]/div[1]/div[9]/div[2]/div/div[1]/div/input")
	WebElement newSettler;
	
	@FindBy(xpath="//*[@id=\"customer-info\"]/div[2]/div[1]/div[10]/div[2]/div/div[1]/div/input")
	WebElement customerRole;
	
	@FindBy(xpath="//*[@id='VendorId']")
	WebElement vendor;
	
	@FindBy(xpath="//*[@id='Active']")
	WebElement active;
	
	@FindBy(xpath="//*[@id='AdminComment']")
	WebElement adminComment;
	
	
	@FindBy(xpath="//*[@name='save']")
	WebElement save;
	
	
	
	public void setUsername(String usernames) {
		waitElements.wainforElements(username, 30);
		username.clear();
		username.sendKeys(usernames);
	}
	
	public void setPassword(String pass) {
		waitElements.wainforElements(username, 30);
		password.clear();
		password.sendKeys(pass);
	}
	public void userLogin() {
		waitElements.wainforElements(username, 30);
		login.click();
	}
	public void ClickMoreInfo(String info) {
		waitElements.wainforElements(username, 30);
		moreinfo.sendKeys(info);
	}
	
	public void clickAddNew(String addnew) {
		addNew.click();
	}
	
	public void newEmail(String email) {
		newemail.sendKeys(email);
	}
	public void passwordAdd(String pass) {
		newpassword.sendKeys(pass);
	}
	
	public void firstname(String first) {
		firstName.sendKeys(first);
	}
	
	public void lastname(String last) {
		lastName.sendKeys(last);
	}
	public void genderAdd(String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			genderMale.click();
		}
		else if(gender.equalsIgnoreCase("Female")) {
			genderFemale.click();
		}
	}
	
	public void dateOfBirth(String date) {
		dob.sendKeys(date);
	}
	public void companyName(String companies) {
		company.sendKeys(companies);
	}
	
	
/*	@FindBy(id="SearchEmail")
	WebElement email;
	
	@FindBy(id="SearchFirstName")
	WebElement firstname;
	
	@FindBy(id="SearchLastName")
	WebElement lastname;
	
	@FindBy(id="SearchMonthOfBirth")
	WebElement month;
	
	@FindBy(id="SearchDayOfBirth")
	WebElement day;
	
	@FindBy(id="SearchDayOfBirth")
	WebElement day;
	
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
