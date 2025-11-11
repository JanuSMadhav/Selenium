package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPage {
	public WebDriver driver;
	public NewsPage(WebDriver driver) {
		this.driver = driver;
	}	
		//Login to Grocery Application
		public void enterUsername (String usernamevalue) {
			WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
			username.sendKeys(usernamevalue);
		}
		public void enterPassword(String passwordvalue) {
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		}
		public void signin() {
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();	
		}
		//Click Manage News
		public void clickManageNews() {
		WebElement managenews = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenews.click();
		}
		//Add news
		public void clickaddNews() {
		WebElement addnews = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']"));
		addnews.click();
		}
		public void addNews() {
		WebElement addnewstext = driver.findElement(By.xpath("//textarea[@id='news']"));
		addnewstext.sendKeys("Explore news");
		}
		public void saveNews() {
		WebElement savenews = driver.findElement(By.xpath("//button[@type='submit']"));
		savenews.click();
		}
		public void typeNews() {
			WebElement typenews = driver.findElement(By.xpath("//input[@class='form-control']"));
			typenews.sendKeys("today");	
		}
		public void searchNews() {
			WebElement searchnews = driver.findElement(By.xpath("//button[@class='btn btn-danger btn-fix']"));
			searchnews.click();	
		}
	}


