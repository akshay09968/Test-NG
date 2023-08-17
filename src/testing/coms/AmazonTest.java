package testing.coms;

import java.util.Iterator;


import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AmazonTest {
WebDriver driver ;
	
	@BeforeClass
	public void conn() {	  
	        String baseUrl = "https://www.amazon.in/";       
	        System.out.println("Launching Google Chrome browser"); 
	        
			System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
			driver = new ChromeDriver();	
			driver.get(baseUrl);	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }
	
	@Test(priority=1)
	public void SearchWatch() throws InterruptedException {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(6000);
	}
	
	
	@Test(priority=2)
	public void Uart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
		Thread.sleep(7000); 
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(7000);
		
	}
	
	@AfterClass
	public void end() {	  
	        driver.quit();
    }
	
}