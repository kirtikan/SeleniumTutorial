package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver = new ChromeDriver();  //launching chrome
		
		driver.get("https://www.facebook.com/");

		Select select = new Select(driver.findElement(By.id("day")));
		select.getOptions().size();
		select.selectByVisibleText("16");

		// 		select.isMultiple();
		
//		select.selectByIndex(index);
//		select.selectByValue(arg0);
//		select.selectByVisibleText(arg0);
//		select.deselectByIndex(index);
//		select.deselectByValue(arg0);
//		select.deselectByVisibleText(arg0);
		//select.deselectAll();
		
//	select.getOptions().		
//		select.getAllSelectedOptions();
//		select.getFirstSelectedOption();

		boolean b =select.isMultiple();

//		select.equals(obj)
	
		
		
		

	}

}
