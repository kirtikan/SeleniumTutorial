package SeleniumSession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://makemysushi.com/Recipes/how-to-make-california-sushi-rolls");
		Thread.sleep(3000);
		
		//links -- //a href<http://www.google.com>
		//images -- //img href<http://www.test.com>

		//1. Get the list of all the links and images:
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of full links & images----->"+linkList.size());
		
		List<WebElement> actualLinks = new ArrayList<WebElement>();
		
		//2. iterate linkList: to exclude all the links & images that doesn't have href attribute
		
		for(int i=0; i<linkList.size(); i++) {
			//System.out.println(linkList.get(i).getAttribute("href"));
			
			if(linkList.get(i).getAttribute("href")!=null && (! linkList.get(i).getAttribute("href").contains("javascript"))
					&& (! linkList.get(i).getAttribute("href").contains("mailto")) ) {
				actualLinks.add(linkList.get(i));
			}
		}
		
		//get the size of active link list:
		System.out.println("size of active links & images--->"+actualLinks.size());
		
		//3. check the href url, with the help of httpconnection api
		
		//200 -- Ok
		//404 -- Page not found
		//500 -- internal error
		//400 -- bad request
		
		for( int j=0; j<actualLinks.size(); j++) {
			//System.out.println(actualLinks.get(j).getAttribute("href"));
			HttpURLConnection connection =(HttpURLConnection)new URL(actualLinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage(); //Ok
			connection.disconnect();
			
			System.out.println(actualLinks.get(j).getAttribute("href")+"--->"+response);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
