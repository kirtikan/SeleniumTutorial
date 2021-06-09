package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome	
		driver.manage().window().maximize();  //maximize the window
		driver.manage().deleteAllCookies();  //delete all cookies
		
		driver.get("https://www.spicejet.com/");
		
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
//		Thread.sleep(3000);
//
//		action.moveToElement(driver.findElement(By.linkText("Travel Info"))).build().perform();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.linkText("FAQ")).click();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("SpiceMax")).click();
	}

}
