package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnTest {
	@Test
	public void step1() {
		System.out.println("First Test Case");
	}
	@Test(dependsOnMethods="step1")
	public void step2() {
		System.out.println("Second Test Case");
		Assert.fail();
	}
	@Test(dependsOnMethods="step2", alwaysRun=true)
	public void step3() {
		System.out.println("Third test case");
	}
	@Test(dependsOnMethods="step3")
	public void step4() {
		System.out.println("fourth Test Case");
		Assert.fail();
	}
	@Test
	public void step5() {
		System.out.println("fifth test case");
	}
}
