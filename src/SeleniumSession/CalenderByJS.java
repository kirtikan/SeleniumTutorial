package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderByJS {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		WebElement dateElement = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dateValue = "17/06/2020";
		
		selectDateByJS(driver, dateElement, dateValue);
	}
	
	public static void selectDateByJS(WebDriver driver,WebElement dateElement, String dateValue) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", dateElement);
	}

}
