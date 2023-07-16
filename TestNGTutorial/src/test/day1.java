package test;

import org.testng.annotations.Test;

public class day1 {

	@Test(groups = {"SmokeTest"}) //SmokeTest.xml
	public void greeting()
	{
		System.out.println("Hello Mr X.");
	}
	
	@Test(enabled=false) //this specific test will not execute because we set enabled attribute to false.
	public void wishGoodMorning()
	{
		System.out.println("Good Morning");
	}
	
	@Test
	public void wishGoodNight()
	{
		System.out.println("Good Night");
	}

}
