package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class o7 {
	WebDriver driver;
	
	By newUser = By.id("save");
	
	
	public o7(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnButton()
	{
		driver.findElement(newUser).click();
	
	}
}
