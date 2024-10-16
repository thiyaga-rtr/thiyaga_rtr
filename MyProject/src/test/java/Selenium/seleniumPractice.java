package Selenium;


import java.awt.RenderingHints.Key;
import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import ru.yandex.qatools.ashot.AShot;


public class seleniumPractice {
	
	
	static WebDriver driver;
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
	
	public static void search() {
	
	driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	WebElement searchBox = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
	searchBox.sendKeys("iPhone");
	
	driver.findElement(By.xpath("//")).sendKeys(" ", Keys.ARROW_UP);
		
	}
	
	public static void selectPractice() {
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		dropdown.click();
		//wait.until(ExpectedConditions.elementToBeSelected(dropdown));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Cell Phones & Accessories");
		
		WebElement click = driver.findElement(By.id("gh-btn"));
		click.click();
		driver.findElement(By.className("s-item__title"));
		driver.getTitle();
	}
	
	public static void assertionPractice() {
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		WebElement assertionPractice = driver.findElement(By.xpath("//span[@class='action more button']"));
		driver.manage().window().maximize();
		String print = assertionPractice.getText();
		System.out.println(print);
		String expected = "Shop New Yog";
		
		Assertion assertion = new Assertion();
		assertion.assertEquals(print, expected);
		
		driver.quit();
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void windowHandlesPractice() {
		
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String oldWindow =  driver.getWindowHandle();
		System.out.println(oldWindow);
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> newWindow = driver.getWindowHandles();
		System.out.println(newWindow);
		
		List<String> list = new ArrayList<String>(newWindow);
		driver.switchTo().window(list.get(1));
		driver.manage().window().maximize();
		String childUrl = driver.getCurrentUrl();
		System.out.println(childUrl);
		driver.switchTo().window(list.get(0));
		String parentUrl = driver.getCurrentUrl();
		System.out.println(parentUrl);
		
		for (String window : newWindow) {
			if (!newWindow.equals(window)) {
				driver.switchTo().window(window);
				//driver.manage().window().maximize();
				
				driver.findElement(By.id("firstName")).sendKeys("Thiyagarajan");
		
			}
			
		}
	
	}
	
	public static void actionClassPractice() {
		
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath(null));
		
	}
	
	public static void screenshotExample() throws IOException {
		
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		/*TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File target = new File ("./snaps/screenshot.png");
		FileUtils.copyFile(src, target);*/
		
		Shutterbug.shootPage(driver, Capture.FULL, true).save("./snaps/screenshot3.png");
		
	}
	
	public static void javaScriptExample() {
		
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text() = 'Iframe with in an Iframe']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Thiyagarajan");
		driver.switchTo().defaultContent();
	}
	
	public static void alertExample() {
		
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.className("fa-angle-down"));
		Actions actions = new Actions(driver);
		actions.moveToElement(a).perform();
		
		driver.findElement(By.xpath("//a[@href=\"Alerts.html\"]")).click();
		
		driver.findElement(By.className("btn-danger")).click();
		
		String b = driver.switchTo().alert().getText();
		System.out.println(b);
		
		driver.switchTo().alert().accept();
	
	}
	
	public static void excelReadExample() throws IOException {
		
		String file = "./testdata/testData.xlsx";
		String sheets = "Sheet1";
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet(sheets);
		
		for (int i=0; i<2; i++) {
		XSSFRow row = sheet.getRow(i);
		
		for (int j=0; j<2; j++) {
		XSSFCell cell = row.getCell(j);
		
		String value = cell.getStringCellValue();
		
		System.out.println(value);
		}
		}
		
	}
	
	public static void javaScript() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		
		Actions actions = new Actions(driver);
		//WebElement a = driver.findElement(By.xpath("//a[@class='thrd']"));
		
		Collections c =new () {
		};

		
		//actions.moveToElement(a).click().perform();
		actions.scrollByAmount(0, 200).perform();	
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//search();
		//selectPractice();
		//assertionPractice();
		//windowHandlesPractice();
		//screenshotExample();
		//javaScriptExample();
		//alertExample();
		//excelReadExample();
		//javaScript();
	}
	
}
