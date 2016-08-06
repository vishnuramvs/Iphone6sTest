package com.IphoneTest.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebElementPaths {
	
	WebDriver driver;
	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(id="issDiv0")
	WebElement allDepartments;
	
	
	@FindBy(xpath=".//*[@id='result_0']/div/div[7]/span/span/a/i[1]")
	WebElement reviewStars;

	@FindBy(xpath="//*[@id='a-popover-content-1']/div/div/div/div[1]/span")
	WebElement reviewText;
	
	  public WebElementPaths(WebDriver driver){
		  
	        this.driver = driver;
	 
	        //This initElements method will create all WebElements
	 
	        PageFactory.initElements(driver, this);
	 
	    }

}
