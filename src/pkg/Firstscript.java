package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");	//get method -to load application
		
		
		String title=driver.getTitle();    //get title- to get application title
		String exp="google";
		
		if(title.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		
		driver.navigate().back();
		
		
		
		
		
	}

}
