package testSuite1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class TutorialsNinja {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vinay\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php");
		Thread.sleep(5000);
		
		//driver.findElement(By.className("btn-group")).click();//div[@class='btn-group']//button[@class='btn btn-link dropdown-toggle']
		driver.findElement(By.xpath("//div[@class='btn-group']//button[@class='btn btn-link dropdown-toggle']"));
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/button"));
		for(WebElement option:options) {
			String optionText=option.getText();
			if(optionText.equals("€ Euro")) {
				option.click();
				break;
			}
		}
		
		
		/*for(WebElement currency:options)
		{
			if(currency.getText().equals("€ Euro")) 
			{
				currency.click();
				break;
			}
			
			
		}*/
		WebElement canonClick=driver.findElement(By.linkText("Canon EOS 5D"));
		canonClick.click();
		driver.findElement(By.id("button-cart")).click();
		String actual_error=driver.findElement(By.className("text-danger")).getText();
		String expected_error="select required!";
		//Type1
		Assert.assertEquals(actual_error, expected_error);
		
		//Type2
		Assert.assertTrue(actual_error.contains("select required!"));
		System.out.println("TEST COMPLETED");
	}
}
		
		
		/*for(int i=0;i<options.size();i++) {
			WebElement element=options.get(i);
			String innerHTML=element.getAttribute("innerHTML");
			if(innerHTML.equalsIgnoreCase("€ Euro"))
			{
				element.click();
				break;
			}
			System.out.println("dropdown values"+innerHTML);
		}*/
		
		
	