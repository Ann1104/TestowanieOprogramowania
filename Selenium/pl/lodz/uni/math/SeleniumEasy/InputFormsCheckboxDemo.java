package pl.lodz.uni.math.SeleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFormsCheckboxDemo {
WebDriver driver;

By checkBox1 = By.id("isAgeSelected");
By checkAll = By.xpath("//input[@value='Check All']");
By unCheckAll = By.xpath("//input[@value='Uncheck All']");

public InputFormsCheckboxDemo(WebDriver driver)
{
	this.driver=driver;
}

public void clickOnCheckBox()
{
	driver.findElement(checkBox1).click();
}

}
