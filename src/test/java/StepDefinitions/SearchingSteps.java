package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Pages.Google_home_page;
import Pages.JPMorgan_page;
import Utilities.Generic;
import io.cucumber.java.en.*;

public class SearchingSteps {
	
	WebDriver driver=null;
	Google_home_page home_page;
	JPMorgan_page jp;
	Generic gen= new Generic();
	
	@Given("Open Google")
	public void open_google() {
	   driver=gen.Browser("chrome");
	   driver.navigate().to("https://www.google.com");
	}

	@When("Search for text")
	public void search_for_text() {
		home_page = new Google_home_page(driver);	
		home_page.entersearchtext("J.P.Morgan"); 
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@And("Click the first result returned by Google")
	public void click_the_first_result_returned_by_google() {
		home_page.clickonFirstlink();
	}

	@Then("Verify that the J.P. Morgan logo is shown")
	public void verify_that_the_j_p_morgan_logo_is_shown() {
		jp = new JPMorgan_page(driver);
		jp.verifylogo();
		driver.close();
		driver.quit();
	}


}
