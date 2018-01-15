package pl.lodz.uni.math.SeleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OthersDynamicDataLoading {
	WebDriver driver;
	
	By newUser = By.id("save");
	
	
	public OthersDynamicDataLoading(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnButton()
	{
		driver.findElement(newUser).click();
	
	}
	
	public boolean waiting()
	{
		while (true)
		{
			if(driver.getPageSource().contains("First Name"))
			{
				return true;
			}
		}
		
		
	}
	
	
}
