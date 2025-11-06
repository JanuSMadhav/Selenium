package seleniumbasics;

import org.openqa.selenium.By;

public class HandleLocators extends Base {
	
	public void verifyLocators() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple Form"));
		driver.findElement(By.cssSelector("button[id='button-one']"));//tagname[attribute='value']
		driver.findElement(By.xpath("//button[@id='button-one']"));//relative x-path
		//driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));//absolute xpath
		driver.findElement(By.xpath("//div[contains(text(), 'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		driver.findElement(By.xpath("//div/ancestor::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	}
	
	
	
		

	public static void main(String[] args) {
		 HandleLocators locators = new HandleLocators();
		 locators.initializeBrowser();
		 locators.verifyLocators();

	}

}
