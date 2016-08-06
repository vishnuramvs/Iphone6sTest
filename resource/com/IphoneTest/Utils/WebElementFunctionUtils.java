package com.IphoneTest.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebElementFunctionUtils extends WebElementPaths{

	public WebElementFunctionUtils(WebDriver driver) {
		super(driver);

	}
	
	public void searchText(String input)
	{
		searchBox.sendKeys(input);
	}
	
	public void selectAllDepartments()
	{
		allDepartments.click();
	}
	public String getReviewText()
	{
		return reviewText.getText();
	}
	
	public void moveToReviewStarsFirstElement(WebDriver driver)
	{
        Actions action = new Actions(driver);	
		action.moveToElement(reviewStars).perform();
	}
	//click
	
	
	
	
}
