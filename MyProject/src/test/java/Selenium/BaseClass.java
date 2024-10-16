package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public BaseClass() {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		
	}

}
