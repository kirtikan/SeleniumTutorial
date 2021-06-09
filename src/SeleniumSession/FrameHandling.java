package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		// there are 3 hierarchy- browser, webpage and frame
		// to click any web element on frames we have to switch to frame
		// frames have two imp property i.e. 	INDEX AND NAME------------ index strts from 0
		// Ex. if we have 3 frames then index will be 0,1,2
		// How to identify frame:::::: if u right click on it, will show frame reload or this frame
		// u can pick view frame source
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome
		
		driver.manage().window().maximize();  //maximize the window
		driver.manage().deleteAllCookies();  //delete all cookies		
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/");   //enter url
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		


	}

}
