package testng.parallel;

import java.util.ArrayList;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodTesting {
	
	    @Test    
        public void executSessionOne() throws InterruptedException{
            //First session of WebDriver
	    	System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
			WebDriver driver = new ChromeDriver();	
			
			String url = "https://www.amazon.in/";
			driver.get(url);
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mouse");
			Thread.sleep(2000);
			
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(2000);       
			
			driver.findElement(By.partialLinkText("Dell MS116 1000Dpi USB ")).click();
			Thread.sleep(2000);
			
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
			
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			Thread.sleep(2000);
			
			driver.quit();
        }
        
        @Test    
        public void executeSessionTwo() throws InterruptedException {
    	
        //Second session of WebDriver
        	System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
    		WebDriver driver = new ChromeDriver();	
    		String url = "https://www.amazon.in/";
			driver.get(url);
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LED monitor");
			Thread.sleep(2000);
			
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(2000); 
			
			driver.findElement(By.partialLinkText("Acer EK220Q 21.5 Inch (54.61 cm) Full HD (1920x1080) ")).click();
			Thread.sleep(2000);
			
			ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window(tabs2.get(1));
			
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			Thread.sleep(2000);
			
			driver.quit();
        }
        
        @Test    
        public void executSessionThree() throws InterruptedException{
    	
        //Third session of WebDriver
        	System.setProperty("webdriver.chrome.driver", "//home//akshay//Downloads//chromedriver_linux64//chromedriver");
    		WebDriver driver = new ChromeDriver();	
    		
    		String url = "https://www.amazon.in/";
			driver.get(url);
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphone");
			Thread.sleep(2000);
			
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(2000);  
			
			driver.findElement(By.partialLinkText("boAt Rockerz 450 Bluetooth On Ear Headphones with Mic,")).click();
			Thread.sleep(2000);
			
			ArrayList<String> tabs3 = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window(tabs3.get(1));
			
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			Thread.sleep(2000);
			
			driver.quit();
        }        
}
