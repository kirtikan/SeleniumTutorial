package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome	
		
		driver.manage().window().maximize();  //to maxmize window
		driver.manage().deleteAllCookies();   //to delete all cookies
		
		//dynamic wait   these two waits are global wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);    // this wait is for webpage to be fully loaded
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   // this wait for web elements
		// ex for implicitly wait  - like some image is broken OR Some button is not visible OR some AJAX component
		
		// these waits are dynamic that means if page or element will be loaded in less time than total time given then 
		//rest of the time will be ignored
		

	}

}
