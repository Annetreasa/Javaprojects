package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgm {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/annet/Desktop/Test%20cases%20practical/Webdriverproject/src/pkg/alert.txt.html");
	}
	
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		
		 // alert will pop on page so need to click it;
		Alert a=driver.switchTo().alert();
		

		//to get the text off that alert
		String alertext=a.getText();
		if(alertext.equals("hello i am an alertbox"))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		
		
		a.accept(); //for ok button
		//a.dismiss(); in case there is no button
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("sdsguy");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("hjgy");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}

}
