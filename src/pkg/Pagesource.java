package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String source=driver.getPageSource();    //get source -to get source page(code) of application
		if(source.contains("Gmail"))
		{
			System.out.println("text is present");
		}
		else 
		{
			System.out.println("text is not present");
		}
	}

}
