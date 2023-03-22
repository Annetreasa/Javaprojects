package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprgm {
	
	ChromeDriver driver;
	
	@Before
	
		public void setup()
    {
		
		driver= new ChromeDriver();
		driver.get("https://amazon.in");
		
	}
	
	@Test
	
	public void test1()
	
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
		driver.findElement(By.xpath("//*[@id='nav-cart-text-container']")).click();
		driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("sdgghjhf");
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
	}

}
  