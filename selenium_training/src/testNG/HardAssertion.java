package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	public void test1() {
		Assert.assertEquals(12, 11, "Assertion 1 Failed");
		System.out.println("Assertion 1 Passed");
		
		Assert.assertEquals(11, 11,"Assertion 2 failed");
		System.out.println("Assertion 2 Passed");
	}
	
	
	
	
	
//	@Test(dependsOnMethods="test1")
//	public void test2() {
//		Assert.assertEquals(12, 12, "Assertion Failed");
//		System.out.println("Assertion Passed");
//	}
//	@Test(dependsOnMethods="test2")
//	public void test3() {
//		Assert.assertEquals(12, 11, "Assertion Failed");
//		System.out.println("Assertion Passed");
//	}

}
