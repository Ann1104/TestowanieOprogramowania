package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class o10 {

	WebDriver driver;
	
	By pages = By.xpath("//select[@name='example_length']");
	By search = By.xpath("//input[@aria-controls='example']");
	
	
	
	public o10(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnPages(String digit)
	{
		driver.findElement(pages).click();
		driver.findElement(pages).sendKeys(digit);
	}
	
	public void setSearch(String word)
	{
		driver.findElement(search).click();
		driver.findElement(search).sendKeys(word);
	}
}
