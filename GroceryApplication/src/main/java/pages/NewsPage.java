package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class NewsPage {
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();
	PageUtility pageutility = new PageUtility();
	public NewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}	
		//Login to Grocery Application
	@FindBy(xpath="//input[@name='username']") WebElement username;
		public void enterUsername (String usernamevalue) {
	//		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
			//username.sendKeys(usernamevalue);
			pageutility.sendDataToElement(username, usernamevalue);
		}
	@FindBy(xpath="//input[@name='password']") WebElement password;
		public void enterPassword(String passwordvalue) {
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		pageutility.sendDataToElement(password, passwordvalue);
		}
	@FindBy(xpath="//button[@type='submit']") WebElement signin;
		public void signin() {
	//	WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		waitutility.waitUntilClickable(driver, signin);
	//	signin.click();	
		pageutility.clickOnElement(signin);
		}
		//Click Manage News
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']") WebElement managenews;
		public void clickManageNews() {
//		WebElement managenews = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		//managenews.click();
		pageutility.clickOnElement(managenews);
		}
		//Add news
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']") WebElement addnews;
		public void clickaddNews() {
	// WebElement addnews = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']"));
		//addnews.click();
		pageutility.clickOnElement(addnews);
		}
	@FindBy(xpath="//textarea[@id='news']") WebElement addnewstext;
		public void addNews() {
	//	WebElement addnewstext = driver.findElement(By.xpath("//textarea[@id='news']"));
		//addnewstext.sendKeys("Explore news");
		pageutility.sendDataToElement(addnewstext, "Explore news");
		}
	@FindBy(xpath="//button[@type='submit']") WebElement savenews;
		public void saveNews() {
	//	WebElement savenews = driver.findElement(By.xpath("//button[@type='submit']"));
		savenews.click();
		pageutility.clickOnElement(savenews);
		}
	@FindBy(xpath="//input[@class='form-control']") WebElement typenews;
		public void typeNews() {
		//	WebElement typenews = driver.findElement(By.xpath("//input[@class='form-control']"));
			//typenews.sendKeys("today");	
			pageutility.sendDataToElement(typenews, "today");
		}
    @FindBy(xpath="//button[@class='btn btn-danger btn-fix']") WebElement searchnews;		
		public void searchNews() {
	    //WebElement searchnews = driver.findElement(By.xpath("//button[@class='btn btn-danger btn-fix']"));
			//searchnews.click();	
			pageutility.clickOnElement(searchnews);
		}
	}


