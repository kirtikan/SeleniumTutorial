package SeleniumSession;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException {
		
		//JavaScriptExecutor:: It's like a toniq to boost up the performance of selenium script. When nothing is working and the DOM 
		//structore or HTML code is very complex & id is so dynamic in nature in that case we can use it.
		//We can also some intresting things with this like :
		//1. If u want highlight some element
		//2. If u want to scroll up ot scroll down
		//3. if u want to capture the screenshot with border
		//4. we can click on a specific button or link with this
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.ebay.com");
		driver.findElement(By.id("gh-ac")).sendKeys("watches");
	    //driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		//executeScript :: to execute JavaScript code
		
		//WebElement element =driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		WebElement element =driver.findElement(By.id("gh-btn"));
		flash(element,driver);  // to highlight button
		
		drawBorder(element,driver);  //draw border
		
		//take screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Kirti\\eclipse-workspace\\SeleniumTutorial\\src\\element.png"));
		
		//generate Alert
		generateAlert(driver,"There is an issue with LogIn Button");
		
		//clicking on a button with JavaScript
		clickElementByJS(driver,element);
		
		//to refresh the page
		//1. by using selenium
		//driver.navigate().refresh(); 
		
		//2. by using JS
	    refreshBrowserByJS(driver);
	    
	    //get page title through JS
	    System.out.println(getTitleByJS(driver));
	    
	    //get page innerText 
	    System.out.println(getPageInnerTextByJS(driver));
	    
	    //scroll down
	   scrollPageDown(driver);
	    
	    driver.navigate().back();
	    
	    //scroll till to defenite element
	    //WebElement scrollToElement = driver.findElement(By.xpath("//a[contains(text(),'Winter Wardrobe')]"));
	    WebElement scrollToElement = driver.findElement(By.linkText("Winter Wardrobe"));
	    scrollIntoView(scrollToElement,driver);

	}

	public static void flash(WebElement element, WebDriver driver) {
	String bgcolor = element.getCssValue("backgroundColor");
	for(int i=0;i<10;i++)
		{
			changeColor("rgb(0,250,0)",element,driver);  //1
			changeColor(bgcolor,element,driver);  //2
		}
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element );
		
		try { 
			Thread.sleep(20);
		}
		catch(InterruptedException e)
		{}
		
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void generateAlert(WebDriver driver, String message)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
		
	}
	
	public static void clickElementByJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location.reload()");
		//js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript(" return document.title;").toString();
		return title; 
	}
	
	public static String getPageInnerTextByJS(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;		
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	}
