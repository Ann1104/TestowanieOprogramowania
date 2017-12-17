package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class o2 {
	WebDriver driver;
	
	By FROM = By.id("from");
	By TO = By.id("to");
	By fromDate = By.xpath("//td[@data-month='11'][@data-year='2017']");
	By nextMonth = By.xpath("//a[@data-handler='next']");
	By toDate = By.xpath("//td[@data-month='0'][@data-year='2018']");
	
	
	public o2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnFrom()
	{
		driver.findElement(FROM).click();
	}
	public void clickOnFromDate(String date)
	{
		driver.findElement(fromDate).sendKeys(date);
	}
	
	public void clickNextMonth()
	{
		driver.findElement(nextMonth).click();
	}
	
	public void clickOnTo()
	{
		driver.findElement(TO).click();
	}
	public void clickOnToDate(String date)
	{
		driver.findElement(toDate).sendKeys(date);
	}
}
