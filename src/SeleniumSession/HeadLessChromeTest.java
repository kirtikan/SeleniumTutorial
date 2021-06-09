package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		//Mandatory:
		//1. chrome version should be greater than 59 on mac & greater than 60 on window
		//2 window-size=1400,800
		
		//Advantage:
		//It's really fast
		//It won't hamper your work by opening browser
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");  //Imp to give window size, otherwise it would come in mobile window size
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options); //launch headless chrome
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");
		
		System.out.println("Login Page Title: "+driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("kirti.16dec@gmail.com");
		driver.findElement(By.name("password")).sendKeys("kirti@292008");	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click(); //login btn custom xpath
		
		System.out.println("Home Page Title: "+driver.getTitle());


	}

}
