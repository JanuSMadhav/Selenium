package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
	@Test (priority = 1, description = "verifying login to the webpage with valid username and valid password")
	
	public void verifyLoginWithValidCredentials() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "LoginSheet");//reading data from excel file: data driven approach
		String passwordvalue = ExcelUtility.getStringData(1, 1, "LoginSheet");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();		
	}
	
	@Test	(priority = 2, description = "verifying login to the webpage with invalid username and valid password")
	
	public void verifyLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(2, 0, "LoginSheet");//reading data from excel file: data driven approach
		String passwordvalue = ExcelUtility.getStringData(2, 1, "LoginSheet");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();		
	}
	
	@Test (priority = 3, description = "verifying login to the webpage with valid username and invalid password")
		
	public void verifyLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(3, 0, "LoginSheet");
		String passwordvalue = ExcelUtility.getStringData(3, 1, "LoginSheet");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();	
}

	@Test (priority = 4, description = "verifying login to the webpage with invalid username and invalid password")
	public void verifyLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(4, 0, "LoginSheet");
		String passwordvalue = ExcelUtility.getStringData(4, 1, "LoginSheet");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();	
	}
	
}
