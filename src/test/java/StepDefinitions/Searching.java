package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Google_home_page;
import Pages.JPMorgan_page;
import Utilities.Generic;
import io.cucumber.java.en.*;

public class Searching 
{
	WebDriver driver=null;
	Google_home_page home_page;
	JPMorgan_page jp;
	Generic gen= new Generic();
	   
	@Given("Open Google")
	public void open_google() 
	{
		String projectpath=System.getProperty("user.dir");
		//driver= gen.Browser("Chrome");
		System.setProperty("webdriver.chrome.driver","D:\\eclipse-workspace\\Cucumberjava\\src\\test\\resources\\Drivers\\chromedriver.exe");//projectpath+"/src/test/sources/Drivers/chromedriver.exe");//System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("Search for J.P.Morgan")
	public void search_for_j_p_morgan() 
	{
	 home_page = new Google_home_page(driver);	
	 home_page.entersearchtext("J.P.Morgan"); 
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@And("Click the first result returned by Google")
	public void click_the_first_result_returned_by_google() 
	{
	 home_page.clickonFirstlink();   
	}

	@Then("Verify that the J.P. Morgan logo is shown")
	public void verify_that_the_j_p_morgan_logo_is_shown() 
	{
		jp = new JPMorgan_page(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    jp.verifylogo();
	}


}
