package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BasePage;
import extentReports.ExtReportDemo;

public class TC004 extends ExtReportDemo {
	
public  static WebDriver driver;
	
	
	@BeforeTest
	public void bf()
	{
		System.out.println("**Before Test3**");
	}
	
	@Test
	public void TC_0003() throws IOException 
	{
			test = extent.createTest("TC_0004");
		
			driver = Base.BasePage.Initialize();
			
			
			
	}
	
	@AfterTest
	public void AfterTest()
	{
		
		System.out.println("**After Test3**");
	}
	
	
	@AfterClass
	public void TearDown()
	{
		System.out.println("**After Class3**");
		BasePage.TearDown();
	}



}
