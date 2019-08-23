package testNG;

import org.testng.annotations.Test;

public class GroupingDemo {

	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("This is test 1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2() {
		System.out.println("This is test 2");
	}
	
	@Test(groups = {"regression","sanity"})
	public void test3() {
		System.out.println("This is test 3");
	}
}
