package testSuite1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumPractice {

	public String baseUrl = "https://westbengal.covidsafe.in/";
	static String driverPath = "C:\\Users\\vinay\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\chromedriver.exe";
	public WebDriver driver;

	@Test
	public void openHomepage() {
		System.out.println("Launching Chrome Browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
}