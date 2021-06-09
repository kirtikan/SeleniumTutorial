package HashMapInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HashMapTest {
	
	public WebDriver driver;
	public String creddential;
	public String credentialInfo[];
	public WebElement userLable;
	
	@BeforeMethod
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
	}
	
	@Test(priority=1)
	public void testLoginWithAdmin() 
	{
		 creddential = Data.getUserLoginInfo().get("admin");
		 //System.out.println(creddential);
		 credentialInfo = creddential.split("#");
		 System.out.println("Credential array length is"+credentialInfo.length);
		 for(int i=0;i<credentialInfo.length;i++) {
			 System.out.println(credentialInfo[i]);
		 }
		 
		 driver.findElement(By.name("email")).sendKeys(credentialInfo[0]);
		 driver.findElement(By.name("password")).sendKeys(credentialInfo[1]);
		 driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		 
		  userLable = driver.findElement(By.xpath("//span[contains(text(),'Kirti Kanojiya')]"));
		  Assert.assertTrue(userLable.isDisplayed());
	}
	
	@Test(priority=2, enabled=false)
	public void testLoginWithCustomer() 
	{
		 creddential = Data.getUserLoginInfo().get("customer");
		 credentialInfo = creddential.split("|");
		 driver.findElement(By.name("email")).sendKeys(credentialInfo[0]);
		 driver.findElement(By.name("password")).sendKeys(credentialInfo[1]);
		 driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
}
