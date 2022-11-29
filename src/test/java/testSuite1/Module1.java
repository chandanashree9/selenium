package testSuite1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module1 {

	@Test(groups = { "SmokeTest" })
	public void WebLoginPersonalLoan() {
		System.out.println("Web Login Personal Loan");
	}

	@Test
	public void MobileLoginPersonalLoan() {
		System.out.println("Mobile Login Personal Loan");
	}

	@Test
	public void APILoginPersonalLoan() {
		System.out.println("API Login Personal Loan");
	}
	
	//Executes the methods under test
	// Test Case 1
	@Test
	public void test1() {
		System.out.println("Test Case 1");
	}

	// Test Case 2
	@Test
	public void test2() {
		System.out.println("Test Case 2");
	}

	//This will be executed before every @test annotated method.
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	// This will be executed after every @test annotated method.
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	//This will be executed before first @Test method execution. It will be executed one only time throughout the test case.
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	//This will be executed after all test methods in the current class have been run
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	//This will be executed before the first @Test annotated method. It can be executed multiple times before the test case.
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	//A method with this annotation will be executed when all @Test annotated methods complete the execution of those classes inside the <test> tag in the TestNG.xml file.
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	// this annotation will run only once before all tests in the suite have run
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	//A method with this annotation will run once after the execution of all tests in the suite is complete.
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
}
