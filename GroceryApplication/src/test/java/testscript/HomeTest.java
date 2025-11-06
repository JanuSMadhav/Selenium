package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;

public class HomeTest extends TestNGBase {
	@Test (priority = 1, description = "Verify logout after logging in")
	
	public void verifyLogoutfunctionality() throws IOException  {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "LoginSheet");//reading data from excel file: data driven approach
		String passwordvalue = ExcelUtility.getStringData(1, 1, "LoginSheet");
		//Login to Grocery Application
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();	
		//Click Admin dropdown for logging out
		WebElement admin = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		admin.click();
		//Click Logout button
		WebElement logout = driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
		logout.click();	
	}	
 
}
