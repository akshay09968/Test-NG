package testng.asserts;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;  

public class TestAssertFalse {  
    
	    @Test
	    public void testNGAssertsFalse() throws Exception{
    	//System Property for chrome Driver   
   	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Virendra\\Desktop\\Simplilearn\\All Phases\\Phase-5\\Selenium Material\\chromedriver.exe");
   	    WebDriver driver = new ChromeDriver();
   	  
        driver.navigate().to("https://www.spicejet.com/");  
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
        
        
        //---------------------------assertNotEquals---------------------------------------------------------------------------------------//
        //--Hello is not equal to the expected string, i.e., How are you. Therefore, the assertion passes the test case. This 
        //--will execute the next statement and the next statement 
        Assert.assertEquals("Hello", "How are you");
        System.out.println("This line ios getting printed because the above assert statement is false"); 
        
        
	    }
} 
