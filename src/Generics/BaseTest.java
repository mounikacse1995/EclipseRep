package Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant{
	

	static
	{
		System.setProperty(CHROM_KEY,CHROM_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	
	public static WebDriver driver;
	public static void openApplication(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		 driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get(URL);
	}
	
	public static void closeApplication()
	{
		driver.close();
	}

}
