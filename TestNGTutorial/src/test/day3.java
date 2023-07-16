package test;

import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("Home Loan Web login");
	}
	
	//From this class only this testcase will exclude becasue we only include this test in testing.xml file.
	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("Home Loan Mobile login");
	}
	
	@Test(groups={"SmokeTest"}) //SmokeTest.xml
	public void APILoginHomeLoan()
	{
		System.out.println("Home Loan API login");
	}
}
