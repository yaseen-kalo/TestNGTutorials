package TestAnnotationsTutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Class1 {

	@BeforeClass
	public void BeforeClass() 
	{
		System.out.println("It will execute once before class");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("It will execute before every methods");
	}
	
	@Test(priority=2)
	public void Testcase1()
	{
		System.out.println("TestCase1");
	}
	
	@Test(priority=1) //low priority method/testcase gonna execute first. Thats why here testcase 2 run before testcase 1 and if you
	//do not set priority then that case priority execute first by default.
	public void Testcase2()
	{
		System.out.println("TestCase2");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("It will execute after every methods");
	}
	
	@Test(dependsOnMethods= {"Testcase2"}) //this testcase gonna execute instantly after testcase 2 becasue it depands on it and before
	//testcase 1 because we donot set its priority so it will set 0 by default.
	public void Testcas3()
	{
		System.out.println("TestCase3");
	}
	
	@AfterClass
	public void AfterClass() 
	{
		System.out.println("It will execute once after class");
	}
	
}
