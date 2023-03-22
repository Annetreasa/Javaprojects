package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class RediffDOB {
	
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
	WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select s= new Select(day);
	s.selectByVisibleText("01");
	
	//to find link count and text
	List<WebElement> l1= driver.findElements(By.tagName("a"));  //can use get.options() instead of By.tagname
	System.out.println("total no of links="+l1.size());
	
	for(WebElement element:l1)
	{
		String link=element.getAttribute("href");
		String Text=element.getText();
		System.out.println(link+"----"+Text);
	}
		
	
	WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select m=new Select(month);
	m.selectByVisibleText("JAN");
	
	//to find link count and text
	List<WebElement> l2=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+l2.size());
	
	for(WebElement element:l2)
	{
		String link1=element.getAttribute("href");
		String text1=element.getText();
		System.out.println(link1+"----"+text1);
	}
	
	WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select y=new Select(year);
	y.selectByVisibleText("2020");
	
	//to find link count and text
	List<WebElement> l3=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+l3.size());
	
	for(WebElement element:l3)
	{
		String link2= element.getAttribute("href");
		String text2=element.getText();
		System.out.println(link2+"-----"+text2);
		
	}


    }
}