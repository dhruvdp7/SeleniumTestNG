package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/dhruv/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		WebElement from = driver.findElement(By.id("drag1"));
		WebElement to = driver.findElement(By.xpath("//img[@id=\"drag1\"]/../following-sibling::div"));
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
	}
}