package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class o3 {
	WebDriver driver;
	By green = By.xpath("//button[@data-target='pagado']");
	By red = By.xpath("//button[@data-target='cancelado']");
	
	public o3(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnGreen()
	{
		driver.findElement(green).click();
	}
	
	public void clickOnRed()
	{
		driver.findElement(red).click();
	}
}
