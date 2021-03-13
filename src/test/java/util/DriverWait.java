package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWait {

    WebDriverWait webDriverWait;

    public void waitTillElementIsVisible(WebDriver driver, WebElement element, int seconds){
        webDriverWait = new WebDriverWait(driver, seconds);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void holdTheDriver(WebDriver driver, int seconds){
        webDriverWait = new WebDriverWait(driver, seconds);
    }

    public void waitTillAlertIsPresent(WebDriver driver, int seconds){
        webDriverWait = new WebDriverWait(driver, seconds);
        webDriverWait.until(ExpectedConditions.alertIsPresent());
    }

    public void waitTillElementToBeClicked(WebDriver driver, WebElement element, int seconds){
        webDriverWait = new WebDriverWait(driver, seconds);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
