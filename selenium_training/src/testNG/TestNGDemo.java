package testNG;

import javax.xml.ws.LogicalMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {

	String actualTitle = null;
	String expectedTitle = null;
	public WebDriver driver;
	
	@BeforeSuite
	public void before() {
		System.out.println("hello--demo1");
	}
	
	@BeforeTest
	public void setUpTest() {
		System.out.println("***Before Test**demo1");
		System.setProperty("webdriver.chrome.driver", "/home/dhruv/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider="getSearch")
	public void googleSearch(String search) {
		expectedTitle = search;
		
		System.out.println("***TEST***demo1");
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys(search);
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		actualTitle = driver.getTitle();
	}
	
	@Test
	public void verify() {
		System.out.println("hello");
	}
	
	@DataProvider
	public Object[][] getSearch() {
		return new Object[][] {
			{"Qainfotech"}, {"Hello"}, {"India"}
		};
	}
	//@AfterTest
	public void tearDownTest()
	{
		System.out.println("***After Test***demo1");
		driver.close();
		driver.quit();
	}	
}
