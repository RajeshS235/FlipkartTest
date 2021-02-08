package com.stepdefinitions;


import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
 
		 @Before
		public void browserLaunch() {
		Date d = new Date();
		System.out.println("Start time is "+d);
	}
	@After
	public void tearDown() {
		Date d = new Date();
		System.out.println("End time is "+d);
	}
	
}
