package TestNGParametersTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameter2 {

	@Test
	@Parameters({"companyName"})
	public void printCompanyName(String name)
	{
		System.out.println(name);
	}
}
