package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome		
		driver.manage().window().maximize();  //maximize the window
		driver.manage().deleteAllCookies();  //delete all cookies
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);  // switch to frame if it is present
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).
		release().build().perform();

	}

}
