package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program1 {
	WebDriver driver;


	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		
	}

	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}

	@Test
	public void test1() 
	{
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window tilte"+ driver.getTitle());
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		//list or array will be used to store more than one thing ,here we use set similar to set
		
		Set<String> allwindowhandles= driver.getWindowHandles();
		for(String handle :allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				
				
				
				
			}
		}
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("xdhgfjgjg");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		driver.close();
		
        //or can  be written as--//String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).getText();
        //System.out.println(s);
        //driver.close();
		
		
		driver.switchTo().window(parentwindow);
	}
	
  
}
