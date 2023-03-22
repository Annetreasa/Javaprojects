package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffmail {
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}  
	
	
	@Test()
	public void checkavailability()
	{
		String Buttontext= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		if(Buttontext.equals("check available"))
			{
			
			System.out.println("text is same");
			}
			else
			{
				System.out.println("text is not same");
			}
}
	
	@Test()
	public void logodisplay()
	{
		
		Boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
	
	@Test()
	public void redifftext ()
	{
		String sourcecode=driver.getTitle();
		if(sourcecode.contains("create a rediffmail account"))
		{
			System.out.println("text present");
		}
		else
		{
			System.out.println("text not present");
		}	
	}
		
		@Test()
		public void checkboxdisplay()
		{
			
			Boolean checkbox=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
			if(checkbox)
			{
				System.out.println("checkbox is selected");
			}
			else
			{
				System.out.println("checkbox is not selected");
			}
		}
		
		@Test()	
		public void dropdown()
		{
		WebElement countryfield =driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select c= new Select(countryfield);
		c.selectByVisibleText("50");
		
		
			WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
			Select s= new Select(day);
			s.selectByVisibleText("01");
		
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select m=new Select(month);
		m.selectByVisibleText("JAN");
		
			WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
			Select y=new Select(year);
			y.selectByVisibleText("2020");
			
			WebElement city=driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
			Select i=new Select(city);
			i.selectByVisibleText("Agartala");	
			
			
		
		}
		
		@Test
		public void test1()
		{
			driver.findElement(By.name("name32534197")).sendKeys("Neenu",Keys.ENTER);
			driver.findElement(By.name("login32534197")).sendKeys("Neenu12345",Keys.ENTER);
			driver.findElement(By.name("passwd32534197")).sendKeys("Neenu@113",Keys.ENTER);
			driver.findElement(By.name("confirm_passwd32534197")).sendKeys("Neenu@113",Keys.ENTER);
			driver.findElement(By.name("altemail32534197")).sendKeys("ajnshdgf",Keys.ENTER);
			driver.findElement(By.name("mobno32534197")).sendKeys("354274524",Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[32]/td[3]/input"));
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



