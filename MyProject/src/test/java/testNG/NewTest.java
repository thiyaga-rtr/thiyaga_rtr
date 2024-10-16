package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class NewTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void browserInitiation() {
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		
	}
	
	@Test  (enabled = true)   
	public void windowSettings() {
		
		driver.manage().window().maximize();
	}
	
	
  @Test (invocationCount = 2, priority = 2)
  public void asserionExample() {
	  	WebElement assertionPractice = driver.findElement(By.xpath("//span[@class='action more button']"));
	    String actual = assertionPractice.getText();
		System.out.println(actual);
		String expected = "Shop New Yog";
		
		//Assertion assertion = new Assertion();
		//assertion.assertEquals(print, expected);
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actual, expected);
  }
  
  @AfterTest 
  
  public void closeBrowser() {
	  driver.quit();
  }
}
