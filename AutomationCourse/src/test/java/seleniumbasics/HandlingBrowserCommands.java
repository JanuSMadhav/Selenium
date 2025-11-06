package seleniumbasics;

public class HandlingBrowserCommands extends Base {
	public void verifyBrowserCommands() {
		System.out.println(driver.getCurrentUrl());//returns the current url that is accessed
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());//to get the id of the tab that is open
		System.out.println(driver.getWindowHandles());//to get the ids when multiple tabs are open
		System.out.println(driver.getPageSource());//returns the entire DOM
	}

	public static void main(String[] args) {
		HandlingBrowserCommands browserCommands = new HandlingBrowserCommands();
		browserCommands.initializeBrowser();
		browserCommands.verifyBrowserCommands();

	}

}
