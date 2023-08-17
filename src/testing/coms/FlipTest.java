package testing.coms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class FlipTest {
WebDriver driver ;
	
	@BeforeClass
	public void conn() {	  
	        String baseUrl = "https://www.Flipkart.com/";       
	        System.out.println("Launching Google Chrome browser"); 
	        
			System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
			driver = new ChromeDriver();	
			driver.get(baseUrl);	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }
	
	@Test(priority=1)
	public void SearchPendrive() throws InterruptedException {

		
		driver.findElement(By.className("_3704LK")).sendKeys("pendrive");
		Thread.sleep(4000);
		
		driver.findElement(By.className("L0Z3Pu")).click(); 
		Thread.sleep(6000); 	
		
	}
		
	@Test(priority=2)
	public void Cart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div/img")).click();
		Thread.sleep(6000);
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

		driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
		Thread.sleep(6000);
	}
	
	@AfterClass
	public void end() {	  
//	        driver.close();
	        driver.quit();
	        }
	
}