package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#u_0_r")).sendKeys("Sonia");
		/*
		driver.findElement(By.name("firstname")).sendKeys("Sonia");
		driver.findElement(By.name("lastname")).sendKeys("Rastogi");
		
		driver.findElement(By.name("reg_email__")).sendKeys("soniarastogi.16dec@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("soniarastogi.16dec@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("sonia@292008");
		
		Select select1 = new Select(driver.findElement(By.cssSelector("#day")));
		select1.selectByVisibleText("1");
		
		Select select2 = new Select(driver.findElement(By.cssSelector("#month")));
		select2.selectByVisibleText("Jan");
		
		Select select3 = new Select(driver.findElement(By.cssSelector("#year")));
		select3.selectByVisibleText("1990");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#u_0_8")).click();
		
//		driver.findElement(By.xpath("//input[@name = 'sex' and @value = '1']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("u_0_1b")).click();
		*/

	}

}
