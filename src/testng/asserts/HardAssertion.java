package testng.asserts;

import org.testng.Assert;

import org.testng.annotations.Test;

/*
 * A Hard Assertion is type of assertion that throws an exception immediately when an assert statement fails and continues 
 * with the next test in the test suite. In order to achieve this, we need to handle the Assertion Error that is thrown with a 
 * catch block like a Java exception. After the suite completes execution, the particular test is marked as passed instead of a FAIL.
   
  Let�s assume that there are two tests in a suite, and the first test in the suite has an assertion that fails. In order to continue
   with the second test in the suit, we will have to handle the assertion failure in the first test.*/

public class HardAssertion {

	@Test
	public void test1(){	
	try{
		Assert.assertTrue(2<1);
		System.out.println("Assertion Failed in Test 1");
		
		Assert.assertFalse(1>0);
		System.out.println("Assertion Failed in Test 1");
		
		Assert.assertEquals("Sample", "Sample");
		System.out.println("Assertion Passed in Test 1");
	} 
	catch(AssertionError ae){
		ae.printStackTrace();
	 }
}
	
	
	@Test
	public void test2(){
		try{
		Assert.assertTrue(2>1);
		System.out.println("Assertion passed in Test 2");
		
		Assert.assertFalse(1<0);
		System.out.println("Assertion passed in Test 2");
		
		Assert.assertEquals("Sample", "Sample");
		System.out.println("Assertion Passed in Test 2");	
	} 
	catch(AssertionError ae){
		ae.printStackTrace();
	}	
 }
}
