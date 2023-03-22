package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.yatra.com");
	}
	
	@Test
	
	public void test2()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+li.size());
		for(WebElement element:li)
		{
			String link=element.getAttribute("href");
			String text=element.getText();
			System.out.println(link+"-----"+text);
			
		}

}

}