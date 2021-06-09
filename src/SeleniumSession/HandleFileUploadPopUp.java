package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome
		driver.get("https://html.com/input-type-file/");
		
		//type= file should be present
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\Kirti\\Documents\\TaruBhai\\IMG-20180316-WA0017.jpg");
		

	}

}
