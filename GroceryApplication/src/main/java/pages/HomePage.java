k package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
	this.driver = driver;
}
	public void adminButton() {
		WebElement admin = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		admin.click();
	}
	
public void logout() {
	WebElement logout = driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
	logout.click();	
}
}
