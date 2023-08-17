package testng.asserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/* To deal with the disadvantage of Hard Assertions, customized error handler provided by TestNG is called Soft Assertion. 
 * Soft Assertions are the type of assertions that do not throw an exception when an assertion fails and would continue with
 *  the next step after assert statement. This is usually used when our test requires multiple assertions to be executed and 
 *  the user want all of the assertions/codes to be executed before failing/skipping the tests.*/

public class SoftAssertions {

	@Test
	public void test1(){

	SoftAssert sa= new SoftAssert();

	sa.assertTrue(2<1);
	System.out.println("Assertion Failed");

	sa.assertFalse(1>2);
	System.out.println("Assertion passed");

	sa.assertEquals("Sample", "Failed");
	System.out.println("Assertion Failed");
	
	/*Even now the test PASSED instead of FAILED. The problem here is the test would not fail when an exception is not thrown. 
	 * In order to achieve the desired result we need to call the assertAll() method at the end of the test which will collate 
	 * all the exceptions thrown and fail the test if necessary.*/
	
	sa.assertAll();
	}	
}
