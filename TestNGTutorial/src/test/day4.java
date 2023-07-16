package test;

import org.testng.annotations.Test;

public class day4 {
	
	//API testcases will not execute because we restrict it from testing.xml file using regular expression.
	
	@Test
	public void WebLoginCarFinance()
	{
		System.out.println("Car Finance Web login");
	}
	
	@Test
	public void MobileLoginCarFinance()
	{
		System.out.println("Car Finance Mobile login");
	}
	
	@Test(groups= {"SmokeTest"}) //SmokeTest.xml
	public void APILoginCarFinance()
	{
		System.out.println("Car Finance API login");
	}
	
	@Test(groups= {"SmokeTest"}) //SmokeTest.xml
	public void APIGetDataCarFinance()
	{
		System.out.println("Get all records about Car Finance");
	}
}
