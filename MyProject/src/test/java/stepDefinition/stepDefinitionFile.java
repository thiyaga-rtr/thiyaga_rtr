package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitionFile {
	 WebDriver driver;

	@Given("opening browser")
	public void opening_browser() {
	  driver= new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	}

	@Given("maximize windows")
	public void maximize_windows() {
	    driver.manage().window().maximize();
	}

	@When("search for iPhone16promax")
	public void search_for_i_phone16promax() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone16promax");
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  String a = driver.getTitle();
	  System.out.println(a);
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}



}
