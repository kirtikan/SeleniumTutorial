package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	/*
	 
	1. @BeforeSuit -- setup system property for chrome
	2. @BeforeTest -- launching browser
	3. @BeforeClass -- Enter URL
	4. @BeforeMethod -- login to portal
	5. @Test -- Title Test
	6. @AfterMethod -- logout from portal
	7. @AfterClass -- close browser
	8. @AfterTest -- delete all cookies

	*/
	
	//Pre Conditions ---- starting with @Before	
	@BeforeSuite //1
	public void setUp()
	{
		System.out.println("@BeforeSuit -- setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser()
	{
		System.out.println("@BeforeTest -- launching browser");
	}
	
	@BeforeClass //3
	public void enterURL()
	{
		System.out.println("@BeforeClass -- Enter URL");
	}
	
	
	/*
	@BeforeMethod
	@Test 1
	@AfterMethod
	
	@BeforeMethod
	@Test 2
	@AfterMethod
	
	@BeforeMethod
	@Test 3
	@AfterMethod
	*/
	
	@BeforeMethod  //4
	public void login()
	{
		System.out.println("@BeforeMethod -- login to portal");
	}
	
	//Test Cases ---- starting with @Test
	@Test  //5
	public void titleTest()
	{
		System.out.println("@Test -- Title Test");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("@Test -- Searching Test");
	}
	
	@Test
	public void logoTest()
	{
		System.out.println("@Test -- logo test");
	}
	
	//Post Conditions ---- starting with @After	
	@AfterMethod  //6
	public void logOut()
	{
		System.out.println("@AfterMethod -- logout from portal");
	}
	
	
	@AfterClass  //7
	public void closeBrowser()
	{
		System.out.println("@AfterClass -- close browser");
	}
	
	@AfterTest  //8
	public void deleteAllCookies()
	{
		System.out.println("@AfterTest -- delete all cookies");
	}
	
	@AfterSuite  //9
	public void generateReports()
	{
		System.out.println("@AfterSuite -- generate reports");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
