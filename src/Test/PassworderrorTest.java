package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Passworderrorpage;

public class PassworderrorTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
 @BeforeMethod
 public void url()
 {
	 driver.get("https://www.facebook.com");
 }
 
 @Test
 public void test1()
 {
	 Passworderrorpage ob= new Passworderrorpage(driver);
	 ob.linkclick();
	 ob.setvalues("24652546");
	 ob.searchclick();
 }
}
