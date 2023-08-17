package testng.annotations;

import org.testng.annotations.Test;

// When we make class level @Test annotation, all the public methods of this class will become test methods even if they are not annotated.
// We can still define @Test annotation on of the method if we want to add any attributes to particular test method.

@Test
public class ClassLevel {

	public void MethodOne() {
		System.out.println("Helloo.. Im in method adding numbers");
	}

	@Test
	public void MethodTwo() {
		System.out.println("Helloo.. Im in method divided by zero");
		//int e = 1 / 0;
	}

	@Test(dependsOnMethods={"MethodTwo"})
	public void methodThree() {
		System.out.println("Helloo.. Im in method skip");
	}
}
