package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;

public class NewsTest extends TestNGBase {
	@Test (priority=1, description="Verify adding News")
	public void AddNews() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "LoginSheet");//reading data from excel file: data driven approach
		String passwordvalue = ExcelUtility.getStringData(1, 1, "LoginSheet");
		//Login to Grocery Application
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();	
		//Click Manage News
		WebElement managenews = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenews.click();
		//Add news
		WebElement addnews = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']"));
		addnews.click();
		WebElement addnewstext = driver.findElement(By.xpath("//textarea[@id='news']"));
		addnewstext.sendKeys("Explore news");
		WebElement savenews = driver.findElement(By.xpath("//button[@type='submit']"));
		savenews.click();
		}
	
	 @Test (priority = 2, description ="Verify search news")
	public void searchNews() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "LoginSheet");//reading data from excel file: data driven approach
		String passwordvalue = ExcelUtility.getStringData(1, 1, "LoginSheet");
		//Login to Grocery Application
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();	
		//Click Manage News
		WebElement managenews = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenews.click();
		WebElement search = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		search.click();
		WebElement typenews = driver.findElement(By.xpath("//input[@class='form-control']"));
		typenews.sendKeys("today");
		WebElement searchnews = driver.findElement(By.xpath("//button[@class='btn btn-danger btn-fix']"));
		searchnews.click();
		
	}
	
	

}
