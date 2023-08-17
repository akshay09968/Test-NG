import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewTest {
	WebDriver driver ;
	
	@Test
	public void f() {	  
	        String baseUrl = "https://www.toolsqa.com/";       
	        System.out.println("Launching Google Chrome browser"); 
	        
	        //System Property for chrome Driver   
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe");
			driver = new ChromeDriver();	
			
	        driver.get(baseUrl);
	        String testTitle = "Free1 QA Automation Tools Tutorial for Beginners with Examples";
	        String originalTitle = driver.getTitle();
	        System.out.println(" titile of ethe web page  "+ originalTitle);
	        //Assert.assertEquals(originalTitle, testTitle);
	        //or we can also define the message below if the conditions are not matched
	        Assert.assertEquals(originalTitle, testTitle, "Title of the website is not matching");
  }
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
	}
	
	@AfterMethod
	public void afterMethod() {		
		System.out.println("Finished Test On Chrome Browser");
		driver.close();
	}
}
