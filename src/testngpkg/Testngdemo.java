package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.google.com");
	}  
	
	
	@Test(groups= {"smoke","sanity"})
	public void titleverification()
	{
	String title=driver.getTitle();
	String exp="Google";
	if(title.equalsIgnoreCase(exp))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
	
	@Test(groups= {"sanity"})
	public void logodisplay()
	{
		
		Boolean logo=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
	
	@Test(groups= {"regression","smoke"})
	public void pagesourcecode()
	{
		String sourcecode=driver.getPageSource();
		if(sourcecode.contains("gmail"))
		{
			System.out.println("text present");
		}
		else
		{
			System.out.println("text not present");
		}	
		
		
	}
	@AfterMethod
	public void aftermethod()
	{
		
	}
	
	@AfterTest
	public void browserquit()
	{
		driver.quit();
	}
	
	
	
	
}
