package testSteps;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AnnouncementsPage;
import pages.NetworkPage;
import pages.RegistrationPage;
import util.BrowserFactory;
import util.Constants;
import util.ExcelOperation;
import util.ExtentReport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class PHPTravelSmokeTest extends ExcelOperation{

    WebDriver globalDriver;
    BrowserFactory browserFactory = new BrowserFactory();
    ExtentReport extentReport = new ExtentReport();

    @Parameters({"browserName", "webPageURL"})
    @BeforeSuite
    public void setup(String browserName, String webPageURL){
        ExtentReport.startTest();
        System.out.println(" This is Smoke Test !!!  ");
        globalDriver = browserFactory.getDriver(browserName, Constants.webPageURL);
    }

    @AfterTest
    public void closeTheDriver(){
        globalDriver.close();
        ExtentReport.endTest();
    }

    @Parameters({"firstName", "lastName"})
    @Test(priority = 1)
    public void checkRegistration(String firstName, String lastName){
        RegistrationPage registrationPage = new RegistrationPage(globalDriver);
        registrationPage.enterFirstName(firstName);
        registrationPage.enterLastName(lastName);
        registrationPage.enterEmail("testng@prac.com");
        extentReport.logToReport(LogStatus.PASS, "Navigation Success");
        //registrationPage
    }

    @Test(priority = 2)
    public void checkAnnouncementsPage(){
        AnnouncementsPage announcementsPage = new AnnouncementsPage(globalDriver);
        announcementsPage.announcementPageMethodOne();
    }

    @Test(priority = 3)
    public void checkNetworkPage(){
        NetworkPage networkPage = new NetworkPage(globalDriver);
        networkPage.networkPageMethodOne();
    }

    String excelName = "test.xlsx";
    String sheetName = "firstSheet";

    @Test(priority = 4)
    public void createExcel() throws IOException {
        createNewExcel(excelName, sheetName);
    }

    @Test(priority = 5)
    public void getCellValue() throws IOException {
        readExcel("TestData.xlsx", "TestOne", 3, 4);
    }

    @Override
    public ArrayList<HashMap<String, String>> getDataFromExcel(String excelFileName, String sheetName, String Key) throws Exception {
        return null;
    }
}
