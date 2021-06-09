package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome	
		
		driver.manage().window().maximize();  //maximize the window
		driver.manage().deleteAllCookies();  //delete all cookies
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");  //enter url
			
		//DIFF WAYS FOR XPATH:
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("watches");
		
	    //  driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("watches");
		
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("watches");
		
		driver.findElement(By.xpath("//input[starts-with(@id,'gh-a')]")).sendKeys("watches");
		
		//Absolute xpath = It is complete full address of a element from parent node to child node.
		// It should not be used as it may change in future for a element if some changes in UI
		
		//Disadvantage of absolute xpath
		//1. performance issue 
		//2. not reliable
		//3. can be change at any time in future
		
		//Dynamic id : input
		//id = test_123
		//By.id('test_123')
		//id = test_456
		//id = test_789
		//id = 456_test
		
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("test");
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("test");
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test')]")).sendKeys("test");
		
		//for links : custom xpath
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();

	}

}
