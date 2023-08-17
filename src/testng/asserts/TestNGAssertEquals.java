package testng.asserts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class TestNGAssertEquals {
	 @Test
	 public void testNGAsserts() throws Exception{
     
	 //System Property for chrome Driver�� 
	 System.setProperty("webdriver.chrome.driver", "/home//akshay//Downloads//chromedriver_linux64//chromedriver");
	 WebDriver driver = new ChromeDriver();
	 
	 //Test Condition 1: If Page title matches with actualTitle then it finds email title and enters the value which we pass
	 driver.get("https://www.gmail.com");
	 String actualTitle = "Gmail";
	 Assert.assertEquals(driver.getTitle(), actualTitle);
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("#identifierId")).sendKeys("abc@gmail.com");  
	 //Test Condition 2: If page title didnt match with actualTitle then script throws an exception
	 Thread.sleep(2000);
	 driver.get("https://www.gmail.com");
	 actualTitle = "GoogleMail";
	 Thread.sleep(2000);
	 //Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
	 Assert.assertEquals(driver.getTitle(), actualTitle);
	 }
}