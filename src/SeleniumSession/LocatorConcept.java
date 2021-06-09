package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //launching chrome
		
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		//1. xpath   -- (2) if not hierarchy based
		// Absolute xpath should not be used
		// Only relative xpath should be used     EX: //*[@id="bsRg"]
		
		//driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Kirti");
		//driver.findElement(By.xpath("//input[@id = 'lastname']")).sendKeys("Kanojiya");
		//driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("kirti.16dec@gmail.com");
		
		//2. id  --(1)
		
		//driver.findElement(By.id("firstname")).sendKeys("Kirti");
		//driver.findElement(By.id("lastname")).sendKeys("Kanojiya");
		//driver.findElement(By.id("email")).sendKeys("kirti.16dec@gmail.com");
		
		//3. name  -- (3)
		driver.findElement(By.name("firstname")).sendKeys("Kirti");
		driver.findElement(By.name("lastname")).sendKeys("Kanojiya");
		
		//4.linkText  : this is only for links
		//driver.findElement(By.linkText("Sign in")).click();
		
		//5. partialLinkText : not useful  ----when there is a long text on links
		
		//6. cssSelector  :::   -----(2)  ::: if id is used
		//if id is there - #id 
		//if class is there - .classname
		driver.findElement(By.cssSelector("#email")).sendKeys("kirti.16dec@gmail.com");
		
		//7. class  :: not recomended as class name can be same for diff elements      ----(4)
		driver.findElement(By.className("sfk-btn sfk-btn--facebook btn btn--primary btn--large btn--fluid")).click();
	}

}
