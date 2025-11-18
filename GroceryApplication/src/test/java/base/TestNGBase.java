package base;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameters;

import utilities.ScreenshotUtility;

public class TestNGBase {
	public WebDriver driver;//WebDriver is an interface. accessing the web driver component and using this webdriver a tab is initialized in chrome
	//@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void initializeBrowser() {
		//driver = new ChromeDriver();//creating an instance of Chrome: initializing a chrome browser
		//for disabling password leak protection
		ChromeOptions options = new ChromeOptions();
		Map<String,Object> prefs=new HashMap<>();
		prefs.put("profile.password_manager_leak_detection", false);
		options.setExperimentalOption("prefs", prefs);
		driver=new ChromeDriver(options);
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
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