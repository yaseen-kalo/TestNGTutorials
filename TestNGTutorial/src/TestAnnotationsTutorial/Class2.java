package TestAnnotationsTutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Class2 {

	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("It will execute before test and It will only execute from .xml file");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("It will execute after test and It will only execute from .xml file");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("It will execute before suite and It will only execute from .xml file");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("It will execute after suite and It will only execute from .xml file");
	}
}
