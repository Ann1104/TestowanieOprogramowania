package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class o1 {
WebDriver driver;

By checkBox1 = By.id("isAgeSelected");
By checkAll = By.xpath("//input[@value='Check All']");
By unCheckAll = By.xpath("//input[@value='Uncheck All']");

public o1(WebDriver driver)
{
	this.driver=driver;
}

public void clickOnCheckBox()
{
	driver.findElement(checkBox1).click();
}

public void clickOnCheckButtion()
{
	driver.findElement(checkAll).click();
	driver.findElement(unCheckAll).click();
}


}
