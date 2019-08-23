package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//locating Web elements
public class GoogleSearch {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "/home/dhruv/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
//		driver.findElement(By.xpath(xpathExpression))
		driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]"));
//		driver.findElement(By.name("q")).sendKeys("Qainfotech");
//		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
}
