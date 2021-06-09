package SeleniumSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome
		
		driver.manage().window().maximize();  //maximize the window
		driver.manage().deleteAllCookies();  //delete all cookies		
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("java");
		
		List<WebElement> listElements = driver.findElements(By.xpath("//ul[@class='erkvQe']//li//div[@class='LaCQgf']/div[@class='zRAHie']//div[1]//span"));
		System.out.println(listElements.size());
		
		//Thread.sleep(2000);
		
		//if u want click on option 5 (without precising on text of 5 option) then u can directly do it by xpath:
		//driver.findElement(By.xpath("//ul[@class='erkvQe']//li[5]//div[@class='LaCQgf']/div[@class='zRAHie']//div[1]//span")).click();  --NEW WORKING
		
		//if u want to click on a option with some text
		for(int i=0; i<listElements.size(); i++ ) {
			if(listElements.get(i).getText().equals("javascript"))
			{
				listElements.get(i).click();
				break;
			}
		}
		
		
	}

}
