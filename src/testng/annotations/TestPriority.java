package testng.annotations;

import org.testng.annotations.Test;

public class TestPriority {
		
	@Test(priority = 1)
	public void b_method() {
		System.out.println("This is B method");
	}

	@Test(priority = 2)
	public void a_method() {
		System.out.println("This is A method");
	}

	@Test
	public void d_method() {
		System.out.println("This is D Method");
	}

	@Test
	public void c_method() {
		System.out.println("This is C Method");
	}
}
