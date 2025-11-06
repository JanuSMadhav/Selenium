package testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeTest         
	/*textng.xml when created, we will have <test name="xyx"> tag. We can give test cases
	test classes inside. The prerequisites will be set once before the code is executed.
	It defines a setup method that runs once before all the test methods in a <test> tag 
	(in your TestNG XML file).
	*/
	
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	/*
	 The test methods to be executed after the ones in beforetest will be added in After test
	 */
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass //before starting a test class
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass //after starting a test class
	public void afterClass() {
		System.out.println("After class");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

	@Test
	public void testCase() {
		System.out.println("TestCase");
	}

}
