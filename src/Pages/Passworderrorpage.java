package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Passworderrorpage {
   
	WebDriver driver;

	
	By forgotlink = By.xpath("//*[Contains(text(),'Forgotten password')]"); //forgotten password taken using 'contains'
	By forgotenpasswordmobile =By.id("identify_email");
	By forgotpasswordsearch =By.id("did_submit");
	
	
	public Passworderrorpage(WebDriver driver) {
		this.driver=driver;
	}

	public void linkclick()
	{
		driver.findElement(forgotlink).click();
	}
	
	public void setvalues(String mobilenumber)
	{
		driver.findElement(forgotenpasswordmobile).sendKeys(mobilenumber);
	}
	 public void searchclick()
	 {
		 driver.findElement(forgotpasswordsearch).click();
	 }
}
