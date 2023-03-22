package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	
		
		ChromeDriver driver;
		
		
		@Before
		public void setup()
		 {
			driver=new ChromeDriver();
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		 }
		
		@Test
		public void test1()
		{
			Boolean logo=driver.findElement(By.xpath("//[*@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
			if(logo)
			{
				System.out.println("logo is displayed");
			}
			else
			{
				System.out.println("logo not displayed");	
			}
			
		}

}
