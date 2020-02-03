package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BasePage;
import extentReports.ExtReportDemo;

public class TC001 extends ExtReportDemo {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void bf()
	{
		System.out.println("**Before Test1**");
	}
	

	@Test
	public void TC_0001() throws IOException 
	{
			test = extent.createTest("TC_0001");
		System.out.println("**Test1**");
			//driver = b.loadDriver();
			driver =BasePage.Initialize();
			driver.get("https://www.indiatoday.in/");
			
			//Loggers to log data in the report
	        test.log(Status.INFO, "Test started");
	        test.log(Status.INFO, "Info logged in report");
						
			System.out.println(driver.getTitle());
			Assert.assertTrue(true);
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("**After Test1**");
	}
	
	@AfterClass
	public void TearDown()
	{
		BasePage.TearDown();
		System.out.println("**After Class1**");
	}
}


