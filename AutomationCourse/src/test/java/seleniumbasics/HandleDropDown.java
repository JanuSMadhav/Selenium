package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown extends Base{
	public void verifyDropDowns() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select = new Select(dropDown);//select class takes the web element that we created as the parameter
		//select.selectByIndex(1);
		//select.selectByValue("python");
		select.selectByVisibleText("SQL");
		}
	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBox = driver.findElement(By.xpath("//input[@value='option-1']"));
		checkBox.click();
		System.out.println(checkBox.isSelected());
	}
	
	public void verifyRadioButton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='purple']"));
		radioButton.click();
		//driver.findElements(null);
	}
	
	
	
	

	public static void main(String[] args) {
		HandleDropDown handleDropDown = new HandleDropDown();
		handleDropDown.initializeBrowser();
		//handleDropDown.verifyDropDowns();
		//handleDropDown.verifyCheckBox();
		handleDropDown.verifyRadioButton();

	}

}
