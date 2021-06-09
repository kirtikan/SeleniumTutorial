package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com/register/");  //enter url
		
		//1. isDisplayed method is applicable for all the elements - will give true if element is visible
		
		Thread.sleep(5000);
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed();  // for submit button
		System.out.println(b1);	//true
		
		//2. isEnabled() method:
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2); //false
		
		//3. isSelected method: only for checkbox, dropdown, radiobutton
		boolean b3 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b3);  //true
		
		//de-select the checkbox
		driver.findElement(By.name("agreeTerms")).click();
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);
		
		//isDisplayed() :: used to very presence of a web element within the web page. It will return true if that is present on the page
		// & false if it is not present. It is capable to check the presence of all kinds of elements.
		
		//isEnabled() :: used to verify if the web element is enabled or disabled within the web page. It is primarily used with Buttons.
		
		//isSelected() :: used to verify if web element is selected or not. This is pre-dominately used with Radio buttons, Checkboxes and
		// Dropdowns.
	}

}
