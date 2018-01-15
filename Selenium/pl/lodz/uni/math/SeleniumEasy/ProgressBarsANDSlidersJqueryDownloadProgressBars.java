package pl.lodz.uni.math.SeleniumEasy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgressBarsANDSlidersJqueryDownloadProgressBars {
	WebDriver driver;
	By start = By.id("downloadButton");
	By complete = By.xpath("/html/body/div[3]/div[2]/div[1]");
	By closeWindowButton = By.xpath("/html/body/div[3]/div[3]/div/button");
	
	public ProgressBarsANDSlidersJqueryDownloadProgressBars(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnStart()
	{
		driver.findElement(start).click();
	}
	
	public void closeWindow()
	{
		while (true)
		{
			if(driver.findElement(complete).getText().toString().equals("Complete!"))
			{
				driver.findElement(closeWindowButton).click();
				break;
			}
		}
		
		
	}

}
