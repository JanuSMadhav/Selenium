package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	
	public void getScreenshot(WebDriver driver,String failedTestCase) throws IOException
	{
	TakesScreenshot scrShot = (TakesScreenshot) driver;//class in selenium to take screenshots. Typecasting driver to takescreenshot class
	File screenShot = scrShot.getScreenshotAs(OutputType.FILE);//getScreenshotAs built in method is invoked using the object of takescreenshot class

	String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());//creating time stamp
	File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot");//create file in  directory
	if (!f1.exists()) {
	f1.mkdirs();
	}
	String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp
	+ ".png";
	File finalDestination = new File(destination);
	FileHandler.copy(screenShot, finalDestination);
	}
}