package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclick {
	WebDriver driver;


	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		
	}

	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}

	@Test
	public void test1() 
	{
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement double1 =driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act= new Actions(driver);
		act.contextClick(rightclick);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/span/br[1]]")).click();
		Alert a=driver.switchTo().alert();
		String alert=a.getText();
		System.out.println(alert);
		a.accept();
		
		act.contextClick(double1);
		act.perform();
		
		Alert s=driver.switchTo().alert();
		String alert1=s.getText();
		System.out.println(alert1);
		a.accept();
		
	}

}
