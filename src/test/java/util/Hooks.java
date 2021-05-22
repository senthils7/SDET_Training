package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before

	public void initdriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/senthils/Downloads/chromedriver");

		 driver = new ChromeDriver();
		 
		 System.out.println("In before annotation");
	}
	
	@After
	
	public void exitdriver() {
		driver.quit();
		 System.out.println("In after annotation");

	}

}
