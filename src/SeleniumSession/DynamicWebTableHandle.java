package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("kirti.16dec@gmail.com");
		driver.findElement(By.name("password")).sendKeys("kirti@292008");		
		//driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();  //login btn custom absolute xpath
		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click(); //login btn custom xpath
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		
		//ex: in this we have to click on a checkbox where name is Naveen1 K1
		                           
		
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[2]
		
		//Method-1:
		//String before_xpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		//String after_xpath  = "]/td[2]";
//		String before_xpath = "//tbody/tr[";
//		String after_xpath  = "]/td[2]";

//	   for(int i =1;i<=4;i++) {
//		   
//		  //Thread.sleep(3000);		   
//		   String name =driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();		   
//		   System.out.println(name);
//		   
//		   if(name.contains("Naveen1 K1"))  //i=3
//		   {
//			 //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[1]/div/input    // desired checkbox xpath
//			 driver.findElement(By.xpath(before_xpath+i+"]/td[1]/div")).click();
//		   }
//	   }
	   
	   //Method-2:
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//td[contains(text(),'Naveen1 K1')]//preceding-sibling::td//div")).click();
		//driver.findElement(By.xpath("//td[contains(text(),'Naveen K')]//preceding-sibling::td//div")).click();
		//driver.quit();
	}

}
