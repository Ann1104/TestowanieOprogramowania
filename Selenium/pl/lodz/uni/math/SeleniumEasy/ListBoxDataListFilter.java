package pl.lodz.uni.math.SeleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListBoxDataListFilter {
	WebDriver driver;

	By search = By.xpath("//input[@placeholder='Search Attendees...']");

	public ListBoxDataListFilter(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickOnSearch()
	{
		driver.findElement(search).click();
	}
	
	public void searchName(String name)
	{
		driver.findElement(search).sendKeys(name);
	}

}
