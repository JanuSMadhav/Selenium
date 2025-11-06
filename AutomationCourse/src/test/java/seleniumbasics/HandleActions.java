package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandleActions extends Base {
	
	public void verifyMouseRightClick() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement rightClick = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions act = new Actions(driver);
		act.contextClick(rightClick).build().perform();//build: prepare for the action, perform: execute the action. execution is done using Context click
	}
	
	public void verifyMouseHover() { 
		WebElement right= driver.findElement(By.xpath("//a[text()='Home']"));
		Actions act =  new Actions(driver);
		act.moveToElement(right).build().perform();//moveToElement: method used to simulate mouse hover
	}
	
	public void verifyDragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
	}

	public void verifyKeyboardAction() throws AWTException {
		Robot robot = new Robot();
		//VK - Virtual key. keypress simulates key press activity.
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		//keyrelease to release the press of key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}
	public static void main(String[] args) {
		HandleActions handleActions = new HandleActions();
		handleActions.initializeBrowser();
		//handleActions.verifyMouseRightClick();
		//handleActions.verifyMouseHover();
		//handleActions.verifyDragAndDrop();
		try {
			handleActions.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
