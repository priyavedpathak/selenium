package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	
    WebDriver driver;
	@BeforeSuite
	
	public void beforesuite()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium setup\\chromedriver_win32 (1)\\chromedriver.exe");
		System.out.println("Before Suite");
		this.driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test plan");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Mathod");
		
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class");
	}
	@AfterSuite
	
	public void aftersiute()
	{
		System.out.println("After Suite");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test Plan");
	}
	@Test
	public void anotations()
	{
		System.out.println("This is testng Test");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("fname");
	}
	@Test
	public void anotations1()
	{
		System.out.println("This is testng Test1");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("lname");
	}
	
}
