package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	
	public void fileUploadUsingMouse() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		chooseFile.sendKeys("D:\\JAVA\\Eclipse\\AutomationCourse\\src\\test\\resources\\Sample PDF.pdf");
		WebElement checkAccept = driver.findElement(By.xpath("//input[@class='field_check']"));
		checkAccept.click();
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submit.click();		
	}
	
	public void fileUploadUsingKeyboard() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectFile = driver.findElement(By.xpath("//div[@id='uploader']"));
		selectFile.click();
		StringSelection selection = new StringSelection("D:\\JAVA\\Eclipse\\AutomationCourse\\src\\test\\resources\\Sample PDF.pdf");
		//StringSelection class considers the file path as a string and helps copying the file and pass it 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);//copy is enabled
		//Toolkit is a built in class that helps in cut, copy 
		//getSystemClipboard() creates space to keep the copied file
		//setContents() to enable copying contents. The content here is selection and it is the file path
		//getDefaultToolkit() is a basic method that handles CTRL C, provides provisions like copy, cut, paste
		Robot robot = new Robot(); //Robot class from java AWT package is used to simulate keyboard action
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);//keyPress() method simulates pressing a key from the keyboard
		robot.keyRelease(KeyEvent.VK_ENTER);//keyRelease() method simulates releasing the pressed key
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
	}
	

	public static void main(String[] args) {
		FileUpload fileupload= new FileUpload();
		fileupload.initializeBrowser();
		fileupload.fileUploadUsingMouse();
	}
}

