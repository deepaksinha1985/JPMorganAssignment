package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic {

	WebDriver driver=null;
	
	

	public WebDriver Browser(String browser_name)
	{

		
		try {


			switch(browser_name.toLowerCase().toString())
			{

			case "chrome":
			{
				System.setProperty("webdriver.chorme.driver","D:\\eclipse-workspace\\Cucumberjava\\src\\test\\resources\\Drivers\\chromedriver.exe");//System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
			
				driver= new ChromeDriver();
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
