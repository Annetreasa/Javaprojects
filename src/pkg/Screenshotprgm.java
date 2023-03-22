package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotprgm {
WebDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/annet/Desktop/Test%20cases%20practical/Webdriverproject/src/pkg/alert.txt.html");
	}
	
	
	@Test
	public void test1() throws IOException
	{
		
  // to take screenshot of page  
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src,new File("E://error.png"));
        
 //  to take screenshot of an element only
        
       WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
	   File sc=button.getScreenshotAs(OutputType.FILE);
	   FileHandler.copy(sc,new File("./screenshot/error1.png"));
	   
		
		
  
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
		
		
		a.accept(); //for okay button
		//a.dismiss(); in case there is no button
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("sdsguy");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("hjgy");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}

}


