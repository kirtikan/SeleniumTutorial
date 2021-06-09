package SeleniumSession;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome	
		driver.manage().window().maximize();  //maximize the window
		driver.manage().deleteAllCookies();  //delete all cookies
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");  //enter url
		
		//1. get the total counts of links on the page
		//2. get the text of each link on the page
		
	 List<WebElement> linkList = driver.findElements(By.tagName("a"));
	 
	 //size of linkList
	 System.out.println(linkList.size());
	 
	 for(int i=0;i<linkList.size();i++) {
		// String linkText = linkList.get(i).getText();
		String links = linkList.get(i).getAttribute("href");
		System.out.println(links);
	 }
	 
	 

	}

}
