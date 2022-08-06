package com.codemind.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public static WebDriver getDriver() {
		
	System.setProperty("webdriver.chrome.driver","/src/test/resources/chromedriverdriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.manage().window().maximize();
	return driver;
	}
	
	//copy relative path from src/test/resources
	
	public static void selectValueFromDropdown(WebElement element,String option)
	{
		Select select=new Select(element);
		select.selectByVisibleText(option);
		
	}
	
}
