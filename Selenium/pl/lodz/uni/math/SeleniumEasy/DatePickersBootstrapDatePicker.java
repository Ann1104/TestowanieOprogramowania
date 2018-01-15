package pl.lodz.uni.math.SeleniumEasy;

import org.jbehave.core.annotations.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePickersBootstrapDatePicker {
	WebDriver driver;
	
	By date1 = By.xpath("//i[@class='glyphicon glyphicon-th']");
	By date2 = By.xpath("//th[@class='today']");
	
	By dateFrom = By.xpath("//input[@class='form-control'][@placeholder='Start date']");
	By dateTo = By.xpath("//input[@class='form-control'][@placeholder='End date']");
	
	
	public DatePickersBootstrapDatePicker(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setDate1()
	{
		driver.findElement(date1).click();
		driver.findElement(date2).click();	
	}
	
	
	public void setDate2(String DateFrom)//, String DateTo)
	{
		driver.findElement(dateFrom).click();
		driver.findElement(dateFrom).sendKeys(DateFrom);	
		driver.findElement(dateTo).click();
		//driver.findElement(dateTo).sendKeys(DateTo);
	}
}
