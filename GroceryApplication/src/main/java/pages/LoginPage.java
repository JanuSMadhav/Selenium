package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage {
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();
	PageUtility pageutility = new PageUtility();
	public LoginPage(WebDriver driver) {
		this.driver = driver;	
		//Page factory is the design pattern applied to avoid repetition
		PageFactory.initElements(driver, this); //Initialize page factory
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
	}
	@FindBy(xpath="//input[@name='username']") WebElement username;
	public void enterUserName(String usernamevalue) {
		//WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys(usernamevalue);
		pageutility.sendDataToElement(username, usernamevalue);
		}
	@FindBy(xpath="//input	[@name='password']") WebElement password;
	public void enterPassword(String passwordvalue){
		//WebElement password = driver.findElement(By.xpath("//input	[@name='password']"));
		//password.sendKeys(passwordvalue);	
		pageutility.sendDataToElement(password, passwordvalue);
	}
	@FindBy(xpath="//button[@type='submit']") WebElement signin;
	public void signin() {
	//WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		waitutility.waitUntilClickable(driver, signin);
		//signin.click();
		pageutility.clickOnElement(signin);
	}
}
