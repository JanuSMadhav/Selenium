package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends TestNGBase{
	
	@Test (priority =1, description="Adding new Admin user")
	
	public void addAdminUser() throws IOException{
		String usernamevalue = ExcelUtility.getStringData(1, 0, "LoginSheet");//reading data from excel file: data driven approach
		String passwordvalue = ExcelUtility.getStringData(1, 1, "LoginSheet");
		//Login to Grocery Application
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();	
		//Click Admin User
		WebElement adminuser = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
		adminuser.click();
		WebElement clicknewbutton = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		clicknewbutton.click();	
		FakerUtility faker = new FakerUtility();
		String randomusername = faker.createRandomUserName();
		String randompassword = faker.createRandomPassword();
		WebElement newusername = driver.findElement(By.xpath("//input[@type='text' and @id='username']"));
		newusername.sendKeys(randomusername);
		WebElement newpassword = driver.findElement(By.xpath("//input[@type='password' and @id='password']"));
		newpassword.sendKeys(randompassword);
		WebElement usertype = driver.findElement(By.xpath("//select[@class='form-control' and @name='user_type']"));
		Select select = new Select(usertype);
		select.selectByVisibleText("Staff");
		WebElement savebutton = driver.findElement(By.xpath("//button[@type='submit' and @name='Create']"));
		savebutton.click();
		System.out.println(newusername);		
	}
}
