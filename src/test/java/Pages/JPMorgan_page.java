package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPMorgan_page 
{
	
	
	@FindBy(xpath="//div[1]/div/div/a/img")
	WebElement logo;
	
	WebDriver driver;
	public JPMorgan_page(WebDriver driver)
	{
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	}
	
	
	public void verifylogo()
	{
		
		try {
		
		logo.isDisplayed();
		System.out.println("Validated the logo");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
}
