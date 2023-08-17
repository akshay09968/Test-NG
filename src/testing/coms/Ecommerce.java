package testing.coms;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Ecommerce {
WebDriver driver ;
	
	@Test(groups = { "search" })
	public void a_search() throws InterruptedException{
		String baseUrl = "https://www.amazon.in/";       
        System.out.println("Launching Google Chrome browser"); 
        
		System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		driver = new ChromeDriver();	
		driver.get(baseUrl);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(6000);
	}

	@Test(groups= {"search"})
	public void c_search() throws InterruptedException{
		String baseUrl = "https://www.Flipkart.com/";       
        System.out.println("Launching Google Chrome browser"); 
        
		System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
		driver = new ChromeDriver();	
		driver.get(baseUrl);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.className("_3704LK")).sendKeys("pendrive");
		Thread.sleep(4000);
		
		driver.findElement(By.className("L0Z3Pu")).click(); 
		Thread.sleep(6000);
	}
	
	@Test(groups = { "cart" })
	public void b_cart() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
		Thread.sleep(7000); 
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(7000);
        
        driver.quit();
	}
	
	@Test(groups= {"cart" })
	public void d_cart() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div/img")).click();
		Thread.sleep(6000);
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

		driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
		Thread.sleep(6000);
		driver.quit();
	}
}


