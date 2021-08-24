package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCrmNewContact {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("kirti.16dec@gmail.com");
		driver.findElement(By.name("password")).sendKeys("kirti@292008");		
		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click(); //login btn custom xpath
		
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button/i")).click();
//		driver.findElement(By.xpath("//a[@href='/deals']")).click();
//		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button/i")).click();
		
		//driver.quit();

	}

}
