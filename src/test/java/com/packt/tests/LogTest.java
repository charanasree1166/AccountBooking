package com.packt.tests;

import org.testng.annotations.Test;

import com.packt.base.DriverTest;

public class LogTest extends DriverTest{
	
	@Test
	public void logtest()
	{
			sample.get("https://www.indeedqwe.com/");
			
}
}
