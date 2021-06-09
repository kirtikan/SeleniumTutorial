 package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//1. alert -- javascript popup (Alert API (accept,dismiss))
		//2. file upload Popup -- Browse button  (type=file, sendKeys(path))
		//3. Browser window popup -- Advertisement popup  (windowHandler API, getWindowHandles())
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome	
		
		driver.manage().window().maximize();  //maximize the window
		driver.manage().deleteAllCookies();  //delete all cookies
		
		driver.get("http://www.popuptest.com");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[3]/b/a")).click();
		
		Thread.sleep(2000);
		
		//Diff b/w quit & close
		// close  = close is used to close a single window
		// quit = will close all the windows
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it =handler.iterator();
		String parentwindowid =it.next();   // parentwindowid
		System.out.println(parentwindowid);
		
		String childwindowid =it.next();  // childwindowid
		System.out.println(childwindowid);
		
		driver.switchTo().window(childwindowid);
		Thread.sleep(2000);
		
		System.out.println("child window popup title: "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwindowid);
		Thread.sleep(2000);
		System.out.println("parent windoe title: "+driver.getTitle());

	}

}
