 package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this); //Initialize page factory
}
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin;
	public void adminButton() {
		//WebElement admin = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		admin.click();
	}
	@FindBy(xpath="i[@class='ace-icon fa fa-power-off']") WebElement logout;
public void logout() {
	//WebElement logout = driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
	logout.click();	
}
}
