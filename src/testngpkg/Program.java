package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program {
	
WebDriver driver;


@BeforeTest
public void setup() 
{
	driver=new ChromeDriver();
	
}

@BeforeMethod
public void urlloading()
{
	driver.get("https://www.ebay.com/b/Cell-Phones-Smart-Watches-Acce30ssories/15032/bn_1865441");
}

@Test
public void test1() 
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	
	
}





}