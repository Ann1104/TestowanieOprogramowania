package pl.lodz.uni.math.SeleniumEasy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePickersBootstrapDatePicker {
	WebDriver driver;
	
	By date = By.xpath("//i[@class='glyphicon glyphicon-th']");
	By today = By.xpath("//th[@class='today']");
	
	
	public DatePickersBootstrapDatePicker(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnDate()
	{
		driver.findElement(date).click();
	}
	
	public void clickOnToday()
	{
		driver.findElement(today).click();	
	}


}
