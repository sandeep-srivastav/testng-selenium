package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPageOperation implements IWebOperations {

    WebDriver localDriver;

    public WebPageOperation(WebDriver globalDriver){
        this.localDriver = globalDriver;
    }

    public void enterTextInWebElement(By locator, String textToBeEntered){
        localDriver.findElement(locator).sendKeys(textToBeEntered);
    }

    public void clickOnWebElement(By locator){
        localDriver.findElement(locator).click();
    }

    public void clearWebElement(By locator){
        localDriver.findElement(locator).click();
    }

    public void assertResult(){

    }

    public void selectValueFromDropDown(By locator){
        localDriver.findElement(locator).click();
    }
}
