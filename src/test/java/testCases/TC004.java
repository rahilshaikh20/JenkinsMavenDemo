package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import extentReports.ExtReportDemo;

public class TC004 extends ExtReportDemo {
	
public  static WebDriver driver;
	
	
	@BeforeTest
	public void bf()
	{
		System.out.println("**Before Test4**");
	}
	
	@Test
	public void TC_0003() throws IOException 
	{
			test = extent.createTest("TC_0004");
		
			System.out.println("TC 4 Passed");
			
			
			
	}
	



}
