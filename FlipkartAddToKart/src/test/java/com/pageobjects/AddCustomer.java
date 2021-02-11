package com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(xpath="//*[@id=\"SelectedNewsletterSubscriptionStoreIds\"]")
	WebElement newSettler;

	
	@FindBy(xpath="//*[@id=\"SelectedNewsletterSubscriptionStoreIds_listbox\"]/li[1]")
	WebElement storeName;
	
	@FindBy(xpath="//*[@id=\"SelectedNewsletterSubscriptionStoreIds_listbox\"]/li[2]")
	WebElement testStore;
	
	
	@FindBy(xpath="//*[@id='SelectedNewsletterSubscriptionStoreIds']")
	WebElement selectField;
	
	
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

	@FindBy(xpath="//ul[@id='SelectedCustomerRoleIds_listbox']/li")
	List<WebElement> role;
	
	
	
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
	public void ClickMoreInfo() {
		waitElements.wainforElements(moreinfo, 30);
		moreinfo.click();;
	}
	
	public void clickAddNew() {
		waitElements.wainforElements(addNew, 30);
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
	
	public void selectField(String text) {
		Select s = new Select(selectField);
		s.deselectByVisibleText(text);
	}
	public void taxExampt() {
		isTaxExempt.click();
	}
	
	public void newSettler(String text) {
		waitElements.wainforElements(username, 30);
		driverl.findElement(By.xpath("//*[@id=\"customer-info\"]/div[2]/div[1]/div[9]/div[2]/div/div[1]/div/input")).sendKeys(text, Keys.ENTER);
	}
	
	public void customerRole(String text) {
		
		customerRole.clear();
		
		WebElement list = null;
		
	for(int i = 0; i<role.size(); i++) {
		
		list = driverl.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']/li["+i+"]"));		
		
		String text2 = list.getText();
		
		if(text2.equals("Administrators")) {
			
			list = driverl.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']/li[1]"));		
		}
		else if(text2.equals("Forum Moderators")) {
			
			list = driverl.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']/li[2]"));		
		}
else if(text2.equals("Guests")) {
			
			list = driverl.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']/li[3]"));		
		}
else if(text2.equals("Registered")) {
	
	list = driverl.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']/li[4]"));		
}
else if(text2.equals("Vendors")) {
	
	list = driverl.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_listbox']/li[5]"));		
}
	}
list.click();		
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
