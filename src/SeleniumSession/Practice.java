package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		Thread.sleep(3000);
//		WebElement ele =
		driver.findElement(By.xpath("//div[@id='suggestions']/div[3]")).click();
//		System.out.println(ele.getText() +"\n Hi");
	}

}
