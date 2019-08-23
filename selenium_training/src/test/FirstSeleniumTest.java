package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		
		//String projectlocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","/home/dhruv/chromedriver");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		 		
	}

}
