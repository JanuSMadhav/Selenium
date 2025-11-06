package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;//WebDriver is an interface. accessing the web driver component and using this webdriver a tab is initialized in chrome
	
	public void initializeBrowser() {
		driver = new ChromeDriver();//creating an instance of Chrome: initializing a chrome browser
		
		//driver = new FirefoxDriver(); // initializing firefox browser
				driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize(); // to maximize browser
		//driver.manage().window().minimize(); // to minimize browser
	}
	public void closeBrowser() {
		//driver.close(); //closing the tab
		driver.quit();//closing the window
		
	}
	public static void main(String[] args) {
		Base base = new Base();
		base.initializeBrowser(); //invoking initialize browser
		base.closeBrowser(); //invoking close browser

	}

}
