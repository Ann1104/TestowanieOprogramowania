package pl.lodz.uni.math.SeleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsANDModalsBootstrapAlerts {

	WebDriver driver;
	By autoSuccess = By.id("autoclosable-btn-success");
	By normalWarning = By.id("normal-btn-warning");
	By autoDanger = By.id("autoclosable-btn-danger");
	By normalInfo = By.id("normal-btn-info");
	
	public AlertsANDModalsBootstrapAlerts(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnAutoSuccess()
	{
		driver.findElement(autoSuccess).click();
	}
	
	public void clickOnNormalWarning()
	{
		driver.findElement(normalWarning).click();
	}
	
	public void clickOnAutoDanger()
	{
		driver.findElement(autoDanger).click();
	}
	
	public void clickOnNormalInfo()
	{
		driver.findElement(normalInfo).click();
	}

}
