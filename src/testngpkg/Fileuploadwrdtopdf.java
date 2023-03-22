package testngpkg;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadwrdtopdf {
WebDriver driver;
	
	@BeforeTest
	
	public void setup()
	{
		driver =new ChromeDriver();
				
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	
	@Test
	public void test1() throws IOException
	{
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Runtime.getRuntime().exec("C:\\Users\\annet\\Downloads\\Autoit Folder\\T1.exe");
	}
}
