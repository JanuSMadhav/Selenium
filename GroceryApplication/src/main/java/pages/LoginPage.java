package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;		
	}
	public void enterUserName(String usernamevalue) {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		}
	public void enterPassword(String passwordvalue){
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);		
	}
	public void signin() {
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();	
	}

}
