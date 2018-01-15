package pl.lodz.uni.math.SeleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableTableFilter {
	WebDriver driver;
	By green = By.xpath("//button[@data-target='pagado']");
	By orange = By.xpath("//button[@data-target='pendiente']");
	By red = By.xpath("//button[@data-target='cancelado']");
	
	By smileGreen = By.xpath("//i[@class='media-photo fa fa-smile-o fa-3x'][@style='color:green;']");
	By smileOrange = By.xpath("//i[@class='media-photo fa fa-smile-o fa-3x'][@style='color:orange;']");
	By smileRed = By.xpath("//i[@class='media-photo fa fa-smile-o fa-3x'][@style='color:red;']");
	
	public TableTableFilter(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnGreen()
	{
		driver.findElement(green).click();
	}
	
	public void clickOnOrange()
	{
		driver.findElement(orange).click();
	}
	
	public void clickOnRed()
	{
		driver.findElement(red).click();
	}
	
	
	public boolean isElementPresented(String color)
	{
		switch (color){
		case "green": if(driver.findElement(smileGreen).isDisplayed())
					return true;
					else return false;
		
		
		case "orange": if(driver.findElement(smileOrange).isDisplayed())
					return true;
					else return false;
					
					
		case "red": if(driver.findElement(smileRed).isDisplayed())
				return true;
				else return false;
				
		default: return false;
        			
		}	
	}
	
	
}
