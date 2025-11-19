package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

import constants.Constant;
import utilities.ScreenshotUtility;

public class TestNGBase {
	Properties prop;
	FileInputStream f;
	public WebDriver driver;//WebDriver is an interface. accessing the web driver component and using this webdriver a tab is initialized in chrome
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")//name of  <parameter> tag in crossbrowser xml
	public void initializeBrowser(String browser) throws Exception { //String browser parameter receives the value of <parameter> tag in crossbrowser xml
		//driver = new ChromeDriver();//creating an instance of Chrome: initializing a chrome browser
		//for disabling password leak protection
		prop = new Properties();
		f= new FileInputStream(Constant.CONFIGFILE);
		prop.load(f);
		if(browser.equalsIgnoreCase("chrome")) { //for chrome
			ChromeOptions options = new ChromeOptions();
			Map<String,Object> prefs=new HashMap<>();
			prefs.put("profile.password_manager_leak_detection", false);
			options.setExperimentalOption("prefs", prefs);
			driver=new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("firefox")) {//for firefox		
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize(); // to maximize browser
		}
	@AfterMethod
	public void closeBrowser() {
		//driver.close(); //closing the tab
		//driver.quit();//closing the window
	}
	@AfterMethod(alwaysRun = true)// a test case can fail for many reasons which may stop the execution. to execute the aftermethod, always=true is used
	public void driverQuit(ITestResult iTestResult) throws IOException
	{
		//iTestResult is a predefined interface that contains all the test data related information
		if(iTestResult.getStatus()==ITestResult.FAILURE) //screenshot utility code will be invoked only when iTestResult fails
		{
			ScreenshotUtility screenShot=new ScreenshotUtility();
			screenShot.getScreenshot(driver, iTestResult.getName());//getName method returns the name of the test method
		}
		driver.quit();

	}	
}