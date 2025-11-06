package seleniumbasics;

public class HandleNavigationCommands extends Base{
	
	public void verifyNavigation() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");//navigate to another url
		driver.navigate().back();//back to home url or previous page
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().refresh(); //to refresh the page
	}
	public static void main(String[] args) {
		HandleNavigationCommands navigationcommands = new HandleNavigationCommands();
		navigationcommands.initializeBrowser();
		navigationcommands.verifyNavigation();

	}

}
