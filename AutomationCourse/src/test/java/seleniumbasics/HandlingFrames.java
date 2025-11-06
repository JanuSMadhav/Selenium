package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void verifyFrames() {
	driver.navigate().to("https://demoqa.com/frames");
	List<WebElement>totalframes = driver.findElements(By.tagName("iframe"));//fetch total number of elements with iframe tag in the page
	System.out.println(totalframes.size());
	//driver.switchTo().frame("frame1");
	//driver.switchTo().frame(1);	
	//driver.switchTo().parentFrame();
	WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(frameElement);
	WebElement frameHeading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	System.out.println(frameHeading.getText());
	driver.switchTo().defaultContent();//to release the control 
	
	}

	public static void main(String[] args) {
		HandlingFrames handlingFrames = new HandlingFrames();
		handlingFrames.initializeBrowser();
		handlingFrames.verifyFrames();
			
	}

}
