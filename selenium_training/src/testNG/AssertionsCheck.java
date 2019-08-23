package testNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionsCheck {

	WebDriver driver;

	@BeforeTest
	public void setUpTest() {
		System.out.println("***Before Test**");
		System.setProperty("webdriver.chrome.driver", "/home/dhruv/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("qainfotech");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Test
	public void checkAssertions() {
		String expectedTitle = "qainotech - Google Search";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, expectedTitle);
		//Assert.assertFalse(ActualTitle.equals("qainfotech - Google Search"));
		//Assert.fail();
		Assert.assertNotEquals(ActualTitle, expectedTitle );
		Assert.assertTrue(ActualTitle.equals(expectedTitle));
	}

	@AfterTest
	public void tearDownTest()
	{
		System.out.println("***After Test***");
		driver.close();
		driver.quit();
	}	
}
