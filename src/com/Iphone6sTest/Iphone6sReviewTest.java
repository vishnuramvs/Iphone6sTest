package com.Iphone6sTest;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.IphoneTest.Utils.WebElementFunctionUtils;



public class Iphone6sReviewTest {
	WebDriver driver;
	WebElementFunctionUtils utils;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testReview() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		utils = new WebElementFunctionUtils(driver);
		utils.searchText("Iphone 6s");
		utils.selectAllDepartments();
		utils.moveToReviewStarsFirstElement(driver);

	String reviewText=utils.getReviewText();
	
	System.out.println(reviewText);
	
	String []expectedReview = reviewText.split(" ");
	
	Assert.assertEquals(expectedReview[0], "4.8");
		
	
		
		
	}
	
	
	

}
