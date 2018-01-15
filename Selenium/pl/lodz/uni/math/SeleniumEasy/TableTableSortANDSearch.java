package pl.lodz.uni.math.SeleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableTableSortANDSearch {

	WebDriver driver;
	
	By pages = By.xpath("//select[@name='example_length']");
	By search = By.xpath("//input[@aria-controls='example']");
	
	
	
	public TableTableSortANDSearch(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnPages()
	{
		driver.findElement(pages).click();
	}
	
	public void setIntoPages(String digit)
	{
		driver.findElement(pages).sendKeys(digit);
	}
	
	
	public void clickOnSearch()
	{
		driver.findElement(search).click();
	}
	
	
	public void setIntoSearch(String word)
	{
		driver.findElement(search).sendKeys(word);
	}
	
}
