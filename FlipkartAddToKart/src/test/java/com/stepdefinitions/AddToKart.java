package com.stepdefinitions;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class AddToKart {

	 WebDriver driver;
	 
	@When("i search {string} in search bar and click search")
	public void i_search_in_search_bar_and_click_search(String product) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\YourLogo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		Action build = action.sendKeys(Keys.ESCAPE).build();
		build.perform();
		driver.findElement(By.name("q")).sendKeys(product, Keys.ENTER);
	}
	
	@When("i click the my product")
	public void i_click_the_my_product() {
	
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='_396cs4  _3exPp9'][1]")).click();
	}

	@When("i added my product to add to bags")
	public void i_added_my_product_to_add_to_bags() {
		String parent = driver.getWindowHandle();
		
		Set<String> all = driver.getWindowHandles();
		
		for (String a : all) {
			if(!parent.equals(all)) {
				driver.switchTo().window(a);
			}
		}
		
		driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
		
		
	}

	@When("i used login credential {string} and {string} for add my product to add to bags module")
	public void i_used_login_credential_and_for_add_my_product_to_add_to_bags_module(String string, String string2) {

	}

	@Then("i verify my product is presented in add to bags")
	public void i_verify_my_product_is_presented_in_add_to_bags() {
	
		String pageSource = driver.getPageSource();
			Assert.assertEquals("Apple iPhone XR (Black, 64 GB) (Includes EarPods, Power Adapter)", pageSource);
	
			System.out.println("Added Product is correct verified");
			
	}



	
}
