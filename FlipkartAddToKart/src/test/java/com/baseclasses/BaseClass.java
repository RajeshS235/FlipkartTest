package com.baseclasses;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	
	public static String randomGmail() {
		String gmail = RandomStringUtils.randomAlphabetic(5);
		return gmail;
	}
	
	
}
