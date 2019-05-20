package com.packt.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

/*public class DriverTest {
	
	protected WebDriver sampleDriver;
	

	
	@BeforeMethod(alwaysRun= true)	
	@Parameters ({"browser"})
	public void setup(@Optional("chrome") String browser) 
	{
		
		DriverSetup website=new DriverSetup();
		System.out.println("browser value : " + browser);
		sampleDriver = website.createDriver(browser);
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		

	}
	@AfterMethod(alwaysRun=true)
	public void close()
	{
		sampleDriver.quit();
	}

}*/
public class DriverTest
{	
	protected WebDriver sample;
	@BeforeMethod(alwaysRun=true)
	@Parameters({"browser"})
	public void setUp(@Optional("chrome") String browser) 
	{
	DriverSetup website=new DriverSetup();
	sample=website.createDriver(browser);
	//sample.manage().window().maximize();		
}

@AfterMethod(alwaysRun=true)
public void close()
{ sample.quit();

}
}





