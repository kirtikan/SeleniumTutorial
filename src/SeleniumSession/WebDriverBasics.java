package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
	
	//1. FF Browser  ::: Gecko Driver ----> it's a class in selenium, we have  to create object of it.-> we have to download a exe file.
		
		//*** WebDriver is an interface, FirefoxDriver and ChromeDriver are classes which are implementing WebDriver interface
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kirti\\Documents\\Selenium Leraning\\New folder\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    //WebDriver driver = new FirefoxDriver();  //launch FF
		
		//driver.get("http://www.google.com");  //Entering URL::: url SHOULD START WITH http:
		
		//2. Chrome driver
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver1 = new ChromeDriver();  //launching chrome
		
		driver1.get("http://www.facebook.com");
		
		
		//String title = driver.getTitle();  // get title
		//System.out.println(title);
		
		//validation point
		/*
		if(title.equals("Google"))
		{System.out.println("Correct Title");}
		else
		{System.out.println("Incorrect Title");}		
		System.out.println(driver.getCurrentUrl());
		*/		
		//System.out.println(driver.getPageSource());		
		//driver.quit();				
		//driver.close();
		
		//driver1.close();
		//driver1.findElement(By.);
//		driver1.findElement(arg0).clear();
//		driver1.findElement(arg0).click();
//		driver1.findElement(arg0).findEmement();
//		driver1.findElement(arg0).getAttribute();
//		driver1.findElement(arg0).getClass();
//		driver1.findElement(arg0).getCssValue();
//		driver1.findElement(arg0).getLocation();
//		driver1.findElement(arg0).getRect();
//		driver1.findElement(arg0).getScreenshotAs();
//		driver1.findElement(arg0).getSize();
//		driver1.findElement(arg0).getText();
//		driver1.findElement(arg0).getTagName();
//		driver1.findElement(arg0).isDisplayed();
//		driver1.findElement(arg0).isEnabled();
//		driver1.findElement(arg0).isSelected();
//		driver1.findElement(arg0).sendKeys();
//		driver1.findElement(arg0).submit();
		
		//driver1.get(arg0);
		driver1.getTitle();		
		driver1.getCurrentUrl();
		driver1.getPageSource();
		driver1.getWindowHandle();
		
		driver1.manage();
		driver1.manage().getCookies();
//		driver1.manage().addCookie(Cookie arg0);
//		driver1.manage().deleteCookie(Cookie arg0);
//		driver1.manage().deleteCookieNamed(String arg0);
//		driver1.manage().getCookieNamed(String arg0);
		driver1.manage().deleteAllCookies();
//		driver1.manage().logs().get(arg0);
		driver1.manage().notify();
//		driver1.manage().timeouts().implicitlyWait(arg0, arg1);
//		driver1.manage().timeouts().pageLoadTimeout(arg0, arg1);
//		driver1.manage().timeouts().setScriptTimeout(arg0, arg1);
		driver1.manage().window().fullscreen();
		driver1.manage().window().getPosition();
		driver1.manage().window().getSize();
		driver1.manage().window().maximize();
//		driver1.manage().window().setPosition(arg0);
//		driver1.manage().window().setSize(arg0);


		driver1.navigate().back();
		driver1.navigate().forward();
		driver1.navigate().refresh();
//		driver1.navigate().to(arg0);
		
		driver1.quit();
		
		driver1.switchTo().activeElement();
		driver1.switchTo().alert();
		driver1.switchTo().defaultContent();
//		driver1.switchTo().frame(arg0);
		driver1.switchTo().parentFrame();
//		driver1.switchTo().window(arg0);
		
		
		//driver1.switchTo();				
		//driver1.quit();
	}

}
