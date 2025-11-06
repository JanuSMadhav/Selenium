package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleWebElementCommands extends Base {
	public void verifyCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageBox.sendKeys("Welcome");
		WebElement showButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		//driver.findElement(By.xpath("//button[@id='button-one']")).click();-- this requires using the same find element multiple times
		showButton.click();
		System.out.println(showButton.isDisplayed());
		System.out.println(showButton.isEnabled());
		WebElement showText = driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(showText.getText());
		System.out.println(showText.getTagName());
		messageBox.clear();
	}

	public static void main(String[] args) {
		HandleWebElementCommands handleWebElementCommands = new HandleWebElementCommands();
		handleWebElementCommands.initializeBrowser();
		handleWebElementCommands.verifyCommands();
	}

}
