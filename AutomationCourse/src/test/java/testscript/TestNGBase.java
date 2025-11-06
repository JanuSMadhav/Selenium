package testscript; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.firefox.FirefoxDriver;	
import org.testng.annotations.Test;

public class TestNGBase {
		public WebDriver driver;//WebDriver is an interface. accessing the web driver component and using this webdriver a tab is initialized in chrome
		@BeforeMethod
		public void initializeBrowser() {
			driver = new ChromeDriver();//creating an instance of Chrome: initializing a chrome browser
			
			//driver = new FirefoxDriver(); // initializing firefox browser
					driver.get("https://www.saucedemo.com/v1/");
			driver.manage().window().maximize(); // to maximize browser
			//driver.manage().window().minimize(); // to minimize browser
		}
		@AfterMethod
		public void closeBrowser() {
			//driver.close(); //closing the tab
			driver.quit();//closing the window
		}
		
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("After suite");
		}
		
		
}


