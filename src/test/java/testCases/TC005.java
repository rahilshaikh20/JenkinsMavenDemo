package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import extentReports.ExtReportDemo;

public class TC005 extends ExtReportDemo {
	
public  static WebDriver driver;
	
	
	@BeforeTest
	public void bf()
	{
		System.out.println("**Before Test5**");
	}
	
	@Test
	public void TC_0003() throws IOException 
	{
			test = extent.createTest("TC_0005");
			System.out.println("TC 5 Passed");
			
			int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15  }; 
			
			for (int i : arr) {
				
				if(i%3==0 && i%5==0 )
				{
					System.out.println("FizzBuzz");
					//break;
				}
				
				else if (i%3==0  )
				System.out.println("Fizz");
					
				else if(i%5==0)
						System.out.println("Buzz");
				
				else 
					System.out.println(i);
																	
				}
				
			
			}
			
		
	

}


