package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbloginpage;

public class FbLoginTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void testlogin()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("gjhdg@gmail.com","gjkh");
		ob.login();
	}
}
