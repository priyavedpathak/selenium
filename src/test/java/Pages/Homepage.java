package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Homepage {
	
	WebDriver driver;
	WebElement userNameTextbox;
	WebElement genderRadioButton;
	WebElement DateOfBirthInputField;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getUserNameTextbox() {
		return userNameTextbox;
	}

	public void setUserNameTextbox(){
		this.userNameTextbox = driver.findElement(By.xpath("//input[@id='firstName']"));
	}

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public void setGenderRadioButton() {
		this.genderRadioButton = driver.findElement(By.xpath("//input[@id='gender-radio-1']")); 
	}

	public WebElement getDateOfBirthInputField() {
		return DateOfBirthInputField;
	}

	public void setDateOfBirthInputField() {
		DateOfBirthInputField = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	}
	

}
