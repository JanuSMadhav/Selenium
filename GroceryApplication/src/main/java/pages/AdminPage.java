package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constant;

public class AdminPage {
	public WebDriver driver;
	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Click Admin User
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminuser;
	public void clickAdminUser() {
		//WebElement adminuser = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
		adminuser.click();
	}
	//click new button
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement clicknewbutton;
	public void clickNewButton() {
	//WebElement clicknewbutton = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	clicknewbutton.click();	
	}
	//Add new user
	@FindBy(xpath="//input[@type='text' and @id='username']") WebElement newusername;
	public void addNewAdmin(String randomusername) {
		WebElement newusername = driver.findElement(By.xpath("//input[@type='text' and @id='username']"));
		newusername.sendKeys(randomusername);
	}
	@FindBy(xpath="//input[@type='password' and @id='password']") WebElement newpassword;
	public void addPassword(String randompassword) {
		WebElement newpassword = driver.findElement(By.xpath("//input[@type='password' and @id='password']"));
		newpassword.sendKeys(randompassword);
	}
	//Select user type
	@FindBy(xpath="//select[@class='form-control' and @name='user_type']") WebElement usertype;
	public void selectUsertype() {
		//WebElement usertype = driver.findElement(By.xpath("//select[@class='form-control' and @name='user_type']"));
		Select select = new Select(usertype);
		select.selectByVisibleText(Constant.ADMINTYPE);
	}
	
	//save new admin
	@FindBy(xpath="//button[@type='submit' and @name='Create']") WebElement savebutton;
	public void saveUser() {
		//WebElement savebutton = driver.findElement(By.xpath("//button[@type='submit' and @name='Create']"));
		savebutton.click();
	}
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	public boolean isAlertDisplayed() {
	//	WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		return alert.isDisplayed();
	}
	
}

