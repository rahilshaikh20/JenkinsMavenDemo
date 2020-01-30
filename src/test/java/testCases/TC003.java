package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BasePage;

import extentReports.ExtReportDemo;

public class TC003 extends ExtReportDemo {
	
	public  static WebDriver driver;
	
	
	@BeforeTest
	public void bf()
	{
		System.out.println("**Before Test3**");
	}
	
	@Test
	public void TC_0003() throws IOException 
	{
			test = extent.createTest("TC_0003");
		System.out.println("**Test3**");
			driver = Base.BasePage.Initialize();
			//driver=b.loadDriver();
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("abc")).click();
			System.out.println("****NOT PRINTED****");
			Assert.assertTrue(false);
			
			
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
