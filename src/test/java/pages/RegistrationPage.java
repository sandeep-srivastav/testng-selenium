package pages;

import org.openqa.selenium.WebDriver;
import objRepo.RegistrationLocator;
import util.WebPageOperation;

public class RegistrationPage {

    private WebDriver localDriver;
    WebPageOperation webPageOperation;
    public RegistrationPage(WebDriver globalDriver) {
        //super();
        this.localDriver = globalDriver;
        webPageOperation = new WebPageOperation(localDriver);
    }



    /*public void enterPersonalInformation() throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("This is the method with Priority 2");
        localDriver.findElement(By.xpath("//input[@id='inputFirstName']")).clear();
        localDriver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("Selenium");
        localDriver.findElement(By.xpath("//*[@id='inputLastName']")).clear();
        localDriver.findElement(By.xpath("//*[@id='inputLastName']")).sendKeys("TestNG");
        localDriver.findElement(By.xpath("//*[@id='inputEmail']")).clear();
        localDriver.findElement(By.xpath("//*[@id='inputEmail']")).sendKeys("selenium@testng.com");
    }*/

    public void enterFirstName(String firstName){
        webPageOperation.clickOnWebElement(RegistrationLocator.firstNameTestBox);
        webPageOperation.enterTextInWebElement(RegistrationLocator.firstNameTestBox, firstName);
        //System.out.println("I have reached here !!!");
    }

    public void enterLastName(String lastName){
        webPageOperation.clickOnWebElement(RegistrationLocator.lastNameTestBox);
        webPageOperation.enterTextInWebElement(RegistrationLocator.lastNameTestBox, lastName);
        //System.out.println("I have reached here !!!");
    }

    public void enterEmail(String email){
        webPageOperation.clickOnWebElement(RegistrationLocator.email);
        webPageOperation.enterTextInWebElement(RegistrationLocator.email, email);
    }


}
