package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	//after execution, you refresh the project & u will see in project there is a folder named "test-output", open it 
	// here you find a file named "index.html". Right click & get a path & paste it on browser to get a HTML Report.
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test(priority=1,groups= {"Title","test"})
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2,groups="Logo")
	public void googleLogoTest()
	{
	    boolean b =driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	}
	
	@Test(priority=3,groups="Link")
	public void mailLinkTest()
	{
		boolean b1 = driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
	}
	
	@Test(priority=4,groups="test")
	public void test1()
	{
		System.out.println("test 1");
	}
	
	@Test(priority=5,groups="test")
	public void test2()
	{
		System.out.println("test 2");
	}
	
	@Test(priority=6,groups="test")
	public void test3()
	{
		System.out.println("test 3");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
