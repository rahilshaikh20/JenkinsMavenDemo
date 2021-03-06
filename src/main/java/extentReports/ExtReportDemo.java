package extentReports;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Base.BasePage;


public class ExtReportDemo
{
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;
    
    public static int passedCount=0;
    public static int failedCount=0;
    public static int skippedCount=0;
   
             
    @BeforeSuite
    public void setUp()
    {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/Rahil_Report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
         
        /*extent.setSystemInfo("OS", "Mac Sierra");
        extent.setSystemInfo("Host Name", "Krishna");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", "Krishna Sakinala");*/
         
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("AutomationTesting.in Demo Report");
        htmlReporter.config().setReportName("My Own Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.DARK);
    }
     
    @AfterMethod
    public void getResult(ITestResult result) throws IOException
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
			/*
			 * if (driver!=null) { String str=BasePage.captureScreenshot();
			 * test.addScreenCaptureFromPath(str); }
			 */
        	
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
            test.fail(result.getThrowable());
            
            String str=BasePage.captureScreenshot();
            test.addScreenCaptureFromPath(str); //attaching screenshots to failed test cases
        
            
            failedCount++;
            
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
            passedCount++;
        }
        else
        {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
            skippedCount++;
        }
    }
     
    @AfterSuite
    public void tearDown()
    {
        extent.flush();
    }
}
