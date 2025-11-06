package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleMultipleWindows extends Base{
	public void verifyMultipleWindows() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		//For getting handle ID
		String firstWindowHandleId = driver.getWindowHandle();//receives the id of the current tab that is open and stores in a string	
		WebElement clickMe = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickMe.click();//there will be 2 open tabs
		Set<String>handleIDs = driver.getWindowHandles(); //ids of 2 windows will be received and assign in Set
		System.out.println(handleIDs);
		Iterator<String>values=handleIDs.iterator();//traverse through the set
		while(values.hasNext())
		{
			String current_id=values.next();//stores the id in the string current_id
			if(!current_id.equals(firstWindowHandleId))//checks if current id and first window handle ids are not same
			{
				driver.switchTo().window(current_id);//switch if ids are not same
				WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']"));
				email_fld.sendKeys("abc@gmail.com");
				WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit_fld.click();
				driver.switchTo().defaultContent();
			}
		}
		 
	}

	public static void main(String[] args) {
		HandleMultipleWindows handleMultipleWindows = new HandleMultipleWindows();
		handleMultipleWindows.initializeBrowser();
		handleMultipleWindows.verifyMultipleWindows();
	}

}
