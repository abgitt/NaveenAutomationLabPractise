package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@BeforeMethod
	public void b()
	{
		System.out.println("Befor methood");
	}
	@AfterMethod
	public void c()
	{
		System.out.println("After methood");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> myData = TestUtil.getDataFromExcel("RegTest");
		//System.out.println(myData.iterator());
		return myData.iterator();
	}
	@Test(dataProvider="getTestData")
	public void checkDataProverFun(String fname,String lname,String City)
	{
		//System.out.println(fname+lname);
	}
	@DataProvider
	public Iterator<Object[]> getTestDataLogin()
	{
		ArrayList<Object[]> myData = TestUtil.getDataFromExcel("Login");
		//System.out.println(myData.iterator());
		return myData.iterator();
	}
	@Test(dataProvider="getTestDataLogin")
	public void checkDataProverFun2(String fname,String lname,String City)
	{
		System.out.println(fname+lname);
	}
}
