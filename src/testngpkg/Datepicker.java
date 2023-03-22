package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}     
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
	}  
	
	
	@Test()
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@class='uitk-date-picker-menu-months-container']/div[1]/h2"));
			String month1=month.getText();
			if(month1.equals("feb 2023"))
			{
				System.out.println(month1);  
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@class='uitk-calendar']/div[1]/button")).click();
				
			}
			
			
			List<WebElement> alldates1=driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
			for(WebElement dateelement:alldates1)
			{
				String date=dateelement.getAttribute("date-day");
				System.out.println(date);
				if (date.equals("7"))
				{
					dateelement.click();
					System.out.println("date selected");
				}   
			}
			  
			
		}
	}

}
