package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
	public WebDriver driver;
	public AdminPage(WebDriver driver) {
		this.driver = driver;
	}
	//Click Admin User
	public void clickAdminUser() {
		WebElement adminuser = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
		adminuser.click();
	}
	//click new button
	public void clickNewButton() {
	WebElement clicknewbutton = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	clicknewbutton.click();	
	}
	//Add new user
	public void addNewAdmin(String randomusername) {
		WebElement newusername = driver.findElement(By.xpath("//input[@type='text' and @id='username']"));
		newusername.sendKeys(randomusername);
	}
	public void addPassword(String randompassword) {
		WebElement newpassword = driver.findElement(By.xpath("//input[@type='password' and @id='password']"));
		newpassword.sendKeys(randompassword);
	}
	//Select user type
	public void selectUsertype() {
		WebElement usertype = driver.findElement(By.xpath("//select[@class='form-control' and @name='user_type']"));
		Select select = new Select(usertype);
		select.selectByVisibleText("Staff");
	}
	
	//save new admin
	public void saveUser() {
		WebElement savebutton = driver.findElement(By.xpath("//button[@type='submit' and @name='Create']"));
		savebutton.click();
	}
	
}

