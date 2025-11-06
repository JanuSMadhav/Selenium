package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base {
	
	public void verifyTables() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(table.getText());
		//Fetch a specific row
		//WebElement tableRow = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[4]"));
		//System.out.println(tableRow.getText());
		//Fetch a specific column
		WebElement tableColumn=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[4]/td[2]"));
		System.out.println(tableColumn.getText());		
	}

	public static void main(String[] args) {
		HandlingTables handlingTables = new HandlingTables();
		handlingTables.initializeBrowser();
		handlingTables.verifyTables();
	}

}
