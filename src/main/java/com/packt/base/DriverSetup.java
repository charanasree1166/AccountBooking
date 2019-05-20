package com.packt.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverSetup {
	
	private ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	private String browser;
	
	public WebDriver createDriver(String browser)
	{
		switch(browser)
		{
		case("chrome"):
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver.set(new ChromeDriver());
			System.out.println("inside chrome case");
			break;
		case("firefox"):
			System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
			driver.set(new FirefoxDriver());
			break;
		case("ie"):
			System.setProperty("webdriver.ie.driver", "src/main/resources/IEDriverserver.exe");
			driver.set(new InternetExplorerDriver());
			break;
		default:
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver.set(new ChromeDriver());
			System.out.println("inside default chrome case");
			break;
			
		
		}
		return driver.get();
	}

}
