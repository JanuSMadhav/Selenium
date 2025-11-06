package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	public WebDriver driver;//WebDriver is an interface. accessing the web driver component and using this webdriver a tab is initialized in chrome
	@BeforeMethod
	public void initializeBrowser() {
		driver = new ChromeDriver();//creating an instance of Chrome: initializing a chrome browser
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize(); // to maximize browser
		}
	@AfterMethod
	public void closeBrowser() {
		//driver.close(); //closing the tab
		driver.quit();//closing the window
	}
	
	
}