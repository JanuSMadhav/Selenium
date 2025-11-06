package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Executors extends Base{

	public void verifyExecutor() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;//creates object for javascript executor and typecasts from driver to javascript executor
		js.executeScript("arguments[0].click();", showMessageButton); //javascript code for simulating click
		js.executeScript("window.scrollBy(0,200)", "");// relative scrolling
		js.executeScript("window.scrollTo(0,0)", "");// absolute scrolling
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");//0 is the default pixel value of the top, body.scrollHeight means until the last of the page
		
	}
	public static void main(String[] args) {
		Executors executors = new Executors();
		executors.initializeBrowser();
		executors.verifyExecutor();
	}

}


