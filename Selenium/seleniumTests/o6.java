package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class o6 {
	WebDriver driver;

	By search = By.xpath("//input[@placeholder='Search Attendees...']");

	public o6(WebDriver driver)
	{
		this.driver=driver;
	}

	public void searchName(String name)
	{
		driver.findElement(search).sendKeys(name);
	}

}
