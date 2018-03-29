package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
	   
		@Test				
		public void testEasy() {	
			driver.get("http://property.sulekha.com/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Real Estate India, Buy/Sell/Rent Properties in India - Sulekha Property")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			
			 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
		    //driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	