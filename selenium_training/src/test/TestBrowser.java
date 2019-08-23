package test;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBrowser {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Mozzila Firefox");
		System.out.println("Press 2 for Google Chrome");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.setProperty("webdriver.gecko.driver", "/home/dhruv/geckodriver");
			driver = new FirefoxDriver();
			break;
		case 2:
			System.setProperty("webdriver.chrome.driver", "/home/dhruv/chromedriver");
			driver = new ChromeDriver();
			break;
		default:
			System.out.println("INVALID CHOICE");

		}
		
		driver.get("https://google.com");
	}

}
