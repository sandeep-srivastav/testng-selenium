package util;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class ExtentReport {

    static ExtentTest test;
    static ExtentReports report;

    //@BeforeSuite
    public static void startTest()
    {
        System.out.println("In the Extent Report Code !!!! ");
        report = new ExtentReports("/home/sandeep/Desktop/sandy-pc-backup/Studies/" +
                "Automation-Projects/Selenium-Projects/PHP-Travel/test-output"+"/ExtentReportResults.html");
        test = report.startTest("ExtentDemo");
    }

    public void logToReport(LogStatus logStatus, String message){
        test.log(logStatus, message);
    }

    //@AfterSuite
    public static void endTest()
    {
        report.endTest(test);
        report.flush();
    }
}
