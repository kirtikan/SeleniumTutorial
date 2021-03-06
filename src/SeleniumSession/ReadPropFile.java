package SeleniumSession;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ReadPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Kirti\\eclipse-workspace\\SeleniumTutorial\\src\\SeleniumSession\\config.properties");
	
	    prop.load(ip);
		
	    System.out.println(prop.getProperty("name"));
	    System.out.println("age");
	    
	    String url = prop.getProperty("URL");
	    System.out.println(url);
	    
	    String browser = prop.getProperty("browser");
	    System.out.println(browser);
	    
	    
	    if(browser.equals("chrome")) {
	    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		     driver = new ChromeDriver(); //launch chrome		    
	    }
	    else if(browser.equals("FF"))
	    {
	    	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	    	driver = new FirefoxDriver();
	    }
	    else
	    {
	    	System.out.println("No Driver");
	    }
	    	
	    driver.get(url);
	    driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
	    driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
	    driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys("email");
	}

}
