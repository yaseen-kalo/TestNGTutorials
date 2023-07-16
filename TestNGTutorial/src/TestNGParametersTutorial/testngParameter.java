package TestNGParametersTutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngParameter {

	@Test(priority = 1)
	@Parameters({ "i", "j" })
	public void getSum(int a, int b) {
		System.out.println(a + b);
	}

	@Test(priority = 2)
	@Parameters({ "i", "j" })
	public void getDiff(int a, int b) {
		System.out.println(a - b);
	}

	@Test(priority = 3)
	@Parameters({ "i", "j" })
	public void getProduct(int a, int b) {
		System.out.println(a * b);
	}
}
