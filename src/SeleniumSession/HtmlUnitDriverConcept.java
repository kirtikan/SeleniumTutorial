package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		
		//HOW U WILL RUN THE SELENIUM SCRIPT WITHOUT USING THE BROWSER?  -- With the use of HTMLUnitDriver
		// Its usefull in small script, like for 5-6 test scripts & u want to run quickly without using browser
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	      //WebDriver driver = new ChromeDriver();
		
		//HtmlUnitDriver is not available in Selenium 3.x version.
		//HtmlUnitDriver -- to use this concept, we have to download the HtmlUnitDriver JAR file.
		
		//Advantages
		//1. Testing is happening behind the scene -- no browser is launched
		//2. Very fast -- execution of test cases -- Very Fast -- performance of the script
		//3. not suitable for Actions class -- user actions -- mousemovement,doubleClick, drag and drop
		//4. Ghost Driver -- Headless Browser
			  // --HtmlUnitDriver -- Java
			  //--PhantomJS -- JavaScript
		//5. Used in case of Sanity Testing
		
		 WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://wwww.facebook.com");
		
		System.out.println("Before Login Page Tile is :"+driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("test@123");
		driver.findElement(By.cssSelector("#u_0_a")).click();
		
		System.out.println("After Login Page Tile is :"+driver.getTitle());

	}

}
