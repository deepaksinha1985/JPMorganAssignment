package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_home_page 
{

	WebDriver driver;
	public Google_home_page(WebDriver driver)
	{
	 this.driver=driver;
	 PageFactory.initElements(driver, Google_home_page.class);
	}
	
	
	@FindBy(xpath="//div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input") //;//input[@name='q']")
	WebElement txt_searchbox;

	@FindBy(xpath="//a/h3[contains(text(),'J.P. Morgan | Official Website')]")
	WebElement link_jpmorgan;

	
	public void entersearchtext(String value) 
	{
		txt_searchbox.sendKeys(value);
		txt_searchbox.sendKeys(Keys.RETURN);
	}


	public void clickonFirstlink()
	{
		link_jpmorgan.click();
	}



}
