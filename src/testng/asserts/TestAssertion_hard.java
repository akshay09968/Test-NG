package testng.asserts;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class TestAssertion_hard {
	 @Test
	 public void testNGAsserts() throws Exception{
	    
		 try {
			//System Property for chrome Driver�� 
			 System.setProperty("webdriver.chrome.driver", "/home//akshay//Downloads//chromedriver_linux64//chromedriver");
			 WebDriver driver = new ChromeDriver();
			 
			 
			 //Test Condition 1: If Page title matches with actualTitle then it finds email title and enters the value which we pass
			 driver.get("https://www.makemytrip.com");
			 String actualTitle = "Makemytrip";
			 Assert.assertEquals(driver.getTitle(), actualTitle);
			 Thread.sleep(2000);
			 driver.navigate().to("https://www.cleartrip.com");
			 //
			 driver.get("https://www.cleartrip.com");
			 String actualTitle1 = "CLEARTRIP";
			 Assert.assertEquals(driver.getTitle(), actualTitle1);
			 Thread.sleep(2000);
			 driver.navigate().to("https://www.goibibo.com");
			 //
			 driver.get("https://www.goibibo.com");
			 String actualTitle2 = "GoIBI";
			 Assert.assertEquals(driver.getTitle(), actualTitle2);
			 Thread.sleep(2000);
			 driver.navigate().to("https://www.airindia.com");
			 //
			 driver.get("https://www.airindia.com");
			 String actualTitle3 = "Airindiaa";
			 Assert.assertEquals(driver.getTitle(), actualTitle3);
			 Thread.sleep(2000);
			 driver.navigate().to("https://www.redbus.com");
			 //
			 driver.get("https://www.redbus.com");
			 String actualTitle4 = "redbus";
			 Assert.assertEquals(driver.getTitle(), actualTitle4);
			 Thread.sleep(2000);
			 driver.navigate().to("https://www.cleartrip.com");
			 //
			 driver.get("https://www.indigo.com");
			 String actualTitle5 = "Flight";
			 Assert.assertEquals(driver.getTitle(), actualTitle5);
			 Thread.sleep(2000);
		 }catch(AssertionError a) {
			 a.printStackTrace();
		 }
	 }
}

//@Test
//public void test1(){	
//try{
//} 
//catch(AssertionError ae){
//	ae.printStackTrace();
// }
//}





