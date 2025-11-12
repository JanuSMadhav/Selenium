package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;	
		//Page factory is the design pattern applied to avoid repetition
		PageFactory.initElements(driver, this); //Initialize page factory
	}
	@FindBy(xpath="//input[@name='username']") WebElement username;
	public void enterUserName(String usernamevalue) {
		//WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		}
	@FindBy(xpath="//input	[@name='password']") WebElement password;
	public void enterPassword(String passwordvalue){
		//WebElement password = driver.findElement(By.xpath("//input	[@name='password']"));
		password.sendKeys(passwordvalue);		
	}
	public void signin() {
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();	
	}
}
