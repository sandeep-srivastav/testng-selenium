package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    WebDriver driver;

    public WebDriver getDriver(String browserName, String webPageURL) {

        if ("Chrome".equalsIgnoreCase(browserName)) {
            System.out.println("The Browser is Chrome");
            if (driver == null) {
                String driverPath = "/home/sandeep/Desktop/sandy-pc-backup/Studies/Automation-Projects/Selenium-Projects/PHP-Travel/BrowserDriver/OS_Type/Linux/Chrome/chromedriver";
                System.setProperty("webdriver.chrome.driver", driverPath);
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(webPageURL);
            }
        } else if ("Firefox".equalsIgnoreCase(browserName)) {
            System.out.println("The Browser is Firefox");
            if (driver == null) {
                driver = new FirefoxDriver();
            }
        }

        return driver;
    }
}
