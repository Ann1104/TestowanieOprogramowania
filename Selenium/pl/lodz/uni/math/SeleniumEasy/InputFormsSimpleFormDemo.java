package pl.lodz.uni.math.SeleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFormsSimpleFormDemo {
	WebDriver driver;
	
	By message = By.id("user-message");
	By showMessage = By.xpath("//button[@class='btn btn-default'][@onclick='showInput();']");
	
	public InputFormsSimpleFormDemo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnMessage()
	{
		driver.findElement(message).click();
	}
	public void fillMessage(String text)
	{
		driver.findElement(message).sendKeys(text);
	}
	public void clickOnButtonShowMessage()
	{
		driver.findElement(showMessage).click();
	}
}
