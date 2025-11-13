 package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage {
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();
	public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this); //Initialize page factory
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
	public void adminButton() {
		//WebElement admin = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		admin.click();
	}
	@FindBy(xpath="i[@class='ace-icon fa fa-power-off']") WebElement logout;
public void logout() {
	//WebElement logout = driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
	waitutility.waitUntilClickable(driver, logout);
	logout.click();	
}
}
