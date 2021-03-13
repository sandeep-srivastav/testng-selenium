package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface IWebOperations {

    public void enterTextInWebElement(By locator, String textToBeEntered);

    public void clickOnWebElement(By locator);

    public void clearWebElement(By locator);

    public void assertResult();

    public void selectValueFromDropDown(By locator);
}
