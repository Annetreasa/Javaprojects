package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkvalidation {
	
	
	WebDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test1()
	{
		
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+l.size());
		for(WebElement link:l)
		{
			String linkdetails=link.getAttribute("href");
			verify(linkdetails);
		}
		
			
		
	}
	private void verify(String linkdetails) {
		
		//if we didnt get connection chances for error so we give exception handling(try catch),so show it
		
		try
		{
			
		URL u=new URL(linkdetails);
		
		//here we do casting eg.floatv=2f;
		//                      double d=(double) v;
		
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
		    con.connect();
		    if(con.getResponseCode()==200)
		    {
		    	System.out.println("status code is 200----"+linkdetails);
		    }
		    else if(con.getResponseCode()==404)
		    {
		    	System.out.println("status code is 404----"+linkdetails);
		    }
		    else
		    {
		    	System.out.println("other status code ---"+linkdetails);
		    }
		}
			
		    catch(Exception e)
		    {
		    	System.out.println(e.getMessage());
		    }
			
	
			
       	}
	}




