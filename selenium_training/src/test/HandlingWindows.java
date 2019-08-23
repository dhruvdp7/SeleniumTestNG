package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/dhruv/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		System.out.println(driver.getTitle());
		
		WebElement tabbedWindowButton = driver.findElement(By.xpath("//*[@id='Tabbed']/a/button"));
		tabbedWindowButton.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iter = windows.iterator();
		
		String mainWindow = iter.next();
		String childWindow = iter.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
	}
	
	//using method
	public static void switchToWindow(int index) {
		String windowId = null;
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iter = windows.iterator();
		
		for(int i=1; i<= index ; i++) {
			windowId = iter.next();
		}
		driver.switchTo().window(windowId);
	}

}
