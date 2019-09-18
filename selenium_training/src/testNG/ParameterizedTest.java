package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Test
	@Parameters("browser")
	public void printBrowser(@Optional("ie") String browser) {
		if(browser.equals("firefox")) {
			System.out.println("Firefox Browser");
		}
		else if (browser.equals("chrome")) {
			System.out.println("chrome browser");
		}
		else {
			System.out.println("Print Nothing");
		}
	}
}
