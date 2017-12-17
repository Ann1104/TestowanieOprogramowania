package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class o4 {
	WebDriver driver;
	By start = By.id("downloadButton");
		
	public o4(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnStart()
	{
		driver.findElement(start).click();
	}
	

}
