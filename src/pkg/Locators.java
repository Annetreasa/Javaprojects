package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	ChromeDriver driver;

	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test1()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dhugjhu");
		driver.findElement(By.name("login")).click();
	}
   
//	@After
//	public void browserclose()
//	{
//		driver.quit();
//	}
	
}
