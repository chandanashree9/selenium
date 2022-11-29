package testSuite1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CovidSafe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vinay\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://westbengal.covidsafe.in/");
		Thread.sleep(5000);
		
		
	
	
		for(int i=1;i<12;i++) {
			Thread.sleep(1000);
	   		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).sendKeys(Keys.ENTER);
	
		}
		
		List<WebElement> rows_table = driver.findElements(By.tagName("tr"));
	    //To calculate no of rows In table.
	    int rows_count = rows_table.size();
	    
	    
	    //Loop will execute till the last row of table.
	    for (int row=0; row<rows_count; row++){
	    
	    	WebElement hospDetails = driver.findElement(By.xpath("//button[@class='p-0 text-start btn btn-link']"));
	 	    JavascriptExecutor js = (JavascriptExecutor) driver;
	 	    js.executeScript("arguments[0].click()",hospDetails);
	 	  	
	    	
	    //To locate columns(cells) of that specific row.
	    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
	 
	   
	    //To calculate no of columns(cells) In that specific row.
	    int columns_count = Columns_row.size();
	    System.out.println("Number of cells In Row "+row+" are "+columns_count);
	    
	    
	    //Loop will execute till the last cell of that specific row.
	    for (int column=0; column<columns_count; column++){
	    //To retrieve text from that specific cell.
	        String celtext = Columns_row.get(column).getText();
	        
	        System.out.println(celtext);
	        
	        js.executeScript("arguments[0].click()", hospDetails);
	        
	     }
	    System.out.println("--------------------------------------------------");
	    }
		
	}
		
}	//"Cell Value Of row number: "+row+" and column number "+column+" Is "+