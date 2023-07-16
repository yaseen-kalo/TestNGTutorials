package test;

import org.testng.annotations.Test;

public class day2 {

	@Test
	public void wishWedding()
	{
		System.out.println("Happy Wedding");
	}
	
	// Only this testcase will not execute because we exculde this method from testing.xml file.
	@Test(groups= {"SmokeTest"}) //SmokeTest.xml
	public void wishBirthday()
	{
		System.out.println("Happy Birthday");
	}
}
