package testSteps.regression;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import util.BrowserFactory;
import util.Constants;
import util.DriverWait;
import util.ExcelOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class RegisterTest extends ExcelOperation  {

    WebDriver globalDriver;
    BrowserFactory browserFactory = new BrowserFactory();
    HashMap<String, String> testDataMap = null;
    DriverWait wait = new DriverWait();

    @Parameters({"browserName", "sheetName", "Key"})
    @BeforeSuite
    public void setup(String browserName, String sheetName, String Key){
        System.out.println(" This is Regression Test !!! ");
        globalDriver = browserFactory.getDriver(browserName, Constants.webPageURL);
        Constants.sheetName = sheetName;
        Constants.testKey = Key;
    }

    @Test(priority = 1)
    public void verifyWebPage(){

    }


    @Test(priority = 2)
    public void checkRegistration() throws IOException, InterruptedException {
        RegistrationPage registrationPage = new RegistrationPage(globalDriver);
        testDataMap = new HashMap<>();
        testDataMap.putAll(readExcel(Constants.workbookName, Constants.sheetName, Constants.testKey));
        String username = testDataMap.get("Username");
        System.out.println(" The username is --> "+ username);
        registrationPage.enterFirstName(testDataMap.get("First Name"));
        registrationPage.enterLastName(testDataMap.get("Last Name"));
        registrationPage.enterEmail(testDataMap.get("Email"));
        wait.pauseExecution(globalDriver, 40);
    }

    @AfterTest
    public void closeTheDriver(){
        globalDriver.close();
    }

    @Test
    public void check(){
        System.out.println("Check if this is running !!! ");
    }

    @Override
    public ArrayList<HashMap<String, String>> getDataFromExcel(String excelFileName,
                                                               String sheetName, String Key) throws Exception {
        return null;
    }
}
