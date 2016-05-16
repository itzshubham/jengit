package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void test1(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
}
