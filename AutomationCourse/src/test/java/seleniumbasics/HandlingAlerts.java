package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simplealert.click();
		Alert alert1 = driver.switchTo().alert();//brings focus to alert. Invoking alert using switchTo() method
		System.out.println(alert1.getText());
		alert1.accept(); // to simulate 'ok' action in the alert pop up
	}
	
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confrimalert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confrimalert.click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		//alert2.accept();
		alert2.dismiss();
	}
	
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalert = driver.findElement(By.xpath("//button[@id='promtButton']"));	
		promptalert.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Data");
		//alert3.accept();
		alert3.dismiss();
	}		
	
	

	public static void main(String[] args) {
		 HandlingAlerts alerts = new HandlingAlerts();
		 alerts.initializeBrowser();
		// alerts.verifySimpleAlert();
		 //alerts.verifyConfirmAlert();
		 alerts.verifyPromptAlert();

	}

}
