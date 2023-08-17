package testng.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertProgram {
	
/*	@Test
	public void testCaseOne() {
		System.out.println("*** test case one started ***");
		
		Assert.assertEquals(5, 5, "First hard assert failed");
		System.out.println("hard assert success....");
		
		Assert.assertTrue("Hello".equals("hello"), "Second hard assert failed");
		System.out.println("*** test case one executed successfully ***");
	}

	@Test
	public void testCasetwo() {
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("*** test case two started ***");
		
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
		System.out.println("hard assert success....");
		
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed");
		
		System.out.println("*** test case two executed successfully ***");
		
		softAssert.assertAll();
	}
	*/
	
	//------the above test cases will throw exception in every method---------------//
	/*
	 * comment both methods and execute below	 * */
	
	 SoftAssert softAssert = new SoftAssert();

	@Test
	public void testCasetwo() {
	
		System.out.println("*** test case two started ***");
		
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed - testCasetwo");
		System.out.println("Soft assert success....");
		
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed - testCasetwo");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed - testCasetwo");
		System.out.println("*** test case two executed successfully ***");
		
		softAssert.assertAll();
	}
	
	@Test
	public void testCaseThree() {
		
		System.out.println("*** test case three started ***");
		
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed - testCaseThree");
		System.out.println("Soft assert success....");
		
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed - testCaseThree");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed - testCaseThree");
		System.out.println("*** test case three executed successfully ***");
		
		softAssert.assertAll();
	}
	
}
