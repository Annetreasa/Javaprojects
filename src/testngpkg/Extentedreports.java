package testngpkg;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentedreports {
WebDriver driver;
ExtentHtmlReporter reporter; // to change look and feel
ExtentTest test;       //  to update 
ExtentReports extent;  //to extent or to add new entry in report eg.name/environmental details
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		reporter=new ExtentHtmlReporter("./Reports/myreports.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("Functionaltest");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("testername", "annet");
		extent.setSystemInfo("Browsername","chrome");
	}     
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com");
		
	}  
	

	@Test()
	public void fbtitlevferification() throws IOException
	{
		test=extent.createTest("fbtitlevferification");
		String exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(exp, actual);
	}
	
	@Test()
	public void fbbuttontest() throws IOException
	{
		test=extent.createTest("fbbuttontest");
		String buttontest= driver.findElement(By.xpath(" //*[@id=\"u_0_b\"]")).getText();
		Assert.assertEquals(buttontest, "register");
	}

	@Test()
	public void fblogotest() throws IOException
	{
		test=extent.createTest("fblogotest");
		Boolean logo=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img")).isDisplayed();
		Assert.assertTrue(logo);
	}
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException 
	
	// ITestresult is an interface in testNG.It is a listener used for reporting.
	{
		if(result.getStatus()==ITestResult.FAILURE) //result.getsatuts() means the previously executed method fbtitleverification.
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable()); // reason for the fail is getThrowable extention.
			String screenshotpath=Extentedreports.ScreenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		}
			
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,"test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passed is"+result.getName());
		}
	
	}

	public static String ScreenshotMethod(WebDriver driver, String screenshotname) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String destination="./Screenshot/"+screenshotname+"jpeg";
		FileHandler.copy(src,new File(destination));
		
		return destination;
	}
	
	
	
}
