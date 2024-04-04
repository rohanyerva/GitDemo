package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.messages.types.Duration;

public class Base {
	public WebDriver driver;
	 
	@Before
	public void browserSetUp() {
 
		driver = new ChromeDriver();
 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
 
	// @After
	public void browserClose() {
		driver.quit();
	}
 
	public WebDriver getDriver() {
		return driver;
	}
}
