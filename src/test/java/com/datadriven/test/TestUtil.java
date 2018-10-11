package com.datadriven.test;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil
{
	static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel(String sheet)
	{
		//Xls_Reader reader = null;
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		try
		{
			reader=new Xls_Reader("C:\\Users\\ABI\\eclipse-workspace\\NaveenAL\\src\\test\\java\\com\\testdata\\TestDataGrid.xlsx");
		}
		catch(Exception e)
		{
			
		}
		for(int row = 2;row<=reader.getRowCount(sheet);row++)
		{
			String fName = reader.getCellData(sheet, 1, row);
			String lName = reader.getCellData(sheet, 2, row);
			String city = reader.getCellData(sheet, 0, row);
			Object ob[] = {fName,lName,city};
			mydata.add(ob);
			//mydata.add(new Object[]{fName,lName,city});	
		}
		return mydata;
		
	}
}
