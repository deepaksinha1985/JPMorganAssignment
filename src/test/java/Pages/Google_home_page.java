package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_home_page 
{

	
	
	@FindBy(xpath="//div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	WebElement txt_searchbox;

	@FindBy(xpath="//a/h3[contains(text(),'J.P. Morgan | Official Website')]")
	WebElement link_jpmorgan;
	
	WebDriver driver;
	public Google_home_page(WebDriver driver)
	{
		
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	}
	
	public void entersearchtext(String value) 
	{
		try{
			
		txt_searchbox.sendKeys(value);
		txt_searchbox.sendKeys(Keys.RETURN);
		
		System.out.println("Done with value insertion and pressing enter");
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());	
		}
	}


	public void clickonFirstlink()
	{
		try{
			
	  link_jpmorgan.click();
	  
	  System.out.println("Done with Clicking on First link");
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());	
		}
	}



}
