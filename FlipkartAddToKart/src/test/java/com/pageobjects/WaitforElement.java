package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforElement {

	public WebDriver driver;
	
	public WaitforElement(WebDriver driver) {
		this.driver =  driver;
			}
	
	public void wainforElements(WebElement element, long timeout) {
		WebDriverWait waits =  new WebDriverWait(driver, timeout);
		waits.until(ExpectedConditions.visibilityOf(element));
	}
	
}
