package testng.asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertion_soft {
	@Test
	public void test1() throws InterruptedException{

	SoftAssert sa= new SoftAssert();
	 System.setProperty("webdriver.chrome.driver", "/home//akshay//Downloads//chromedriver_linux64//chromedriver");
	 WebDriver driver = new ChromeDriver();
	 
	 
	 //Test Condition 1: If Page title matches with actualTitle then it finds email title and enters the value which we pass
	 driver.get("https://www.makemytrip.com");
	 String actualTitle = "Makemytrip";
	 sa.assertEquals(driver.getTitle(), actualTitle);
	 Thread.sleep(2000);
	 driver.navigate().to("https://www.cleartrip.com");
	 //
	 driver.get("https://www.cleartrip.com");
	 String actualTitle1 = "CLEARTRIP";
	 sa.assertEquals(driver.getTitle(), actualTitle1);
	 Thread.sleep(2000);
	 driver.navigate().to("https://www.goibibo.com");
	 //
	 driver.get("https://www.goibibo.com");
	 String actualTitle2 = "GoIBI";
	 sa.assertEquals(driver.getTitle(), actualTitle2);
	 Thread.sleep(2000);
	 driver.navigate().to("https://www.airindia.com");
	 //
	 driver.get("https://www.airindia.com");
	 String actualTitle3 = "Airindiaa";
	 sa.assertEquals(driver.getTitle(), actualTitle3);
	 Thread.sleep(2000);
	 driver.navigate().to("https://www.redbus.com");
	 //
	 driver.get("https://www.redbus.com");
	 String actualTitle4 = "redbus";
	 sa.assertEquals(driver.getTitle(), actualTitle4);
	 Thread.sleep(2000);
	 driver.navigate().to("https://www.cleartrip.com");
	 //
	 driver.get("https://www.indigo.com");
	 String actualTitle5 = "Flight";
	 sa.assertEquals(driver.getTitle(), actualTitle5);
	 Thread.sleep(2000);
	
	sa.assertAll();
	}

}
