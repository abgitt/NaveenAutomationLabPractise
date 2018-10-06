package TestNNGSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGFeatures {
	@Test(priority = 2,groups ="Abhi" ,dependsOnMethods = "fTest1")
	public static void fTest2()
	{
		System.out.println("from Test2");
	}
	@Test(priority = 1,groups ="Abhi",expectedExceptions =  AssertionError.class)
	public static void fTest1()
	{
		System.out.println("from Test1");
		Assert.assertTrue(true);
		boolean b = true;
		Assert.assertEquals(true, b);
		Assert.assertFalse(b);
		int i = 9/0;
		
	}
}
//invocationCount
//
