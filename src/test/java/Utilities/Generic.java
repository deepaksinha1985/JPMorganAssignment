package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Generic {

	WebDriver driver=null;



	public WebDriver Browser(String browser_name)
	{


		try {


			switch(browser_name.toLowerCase().toString())
			{

			case "chrome":
			{
				String projectpath=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
				ChromeOptions options = new ChromeOptions(); 
				options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
				driver = new ChromeDriver(options); 
				driver.manage().window().maximize();

				break;
			}

			default:
				System.out.println("Provided browsername is not implemented");


			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}


		return driver;
	}


}
