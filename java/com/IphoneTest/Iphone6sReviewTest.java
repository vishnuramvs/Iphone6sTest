package com.IphoneTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Iphone6sReviewTest {
	WebDriver driver;
	
	@Test
	public void testReview() throws InterruptedException
	{
		driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		
	}
	
	
	

}
