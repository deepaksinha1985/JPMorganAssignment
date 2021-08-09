package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class JPMorgan_page 
{
	WebDriver driver;
	public JPMorgan_page(WebDriver driver)
	{
	 this.driver=driver;
	 PageFactory.initElements(driver, JPMorgan_page.class);
	}
	
	@FindBy(xpath="//div[1]/div/div/a/img")
	WebElement logo;
	
	
	public void verifylogo()
	{
		boolean check= logo.isDisplayed();
		Assert.assertTrue(check);
	}
	
	
	
}
