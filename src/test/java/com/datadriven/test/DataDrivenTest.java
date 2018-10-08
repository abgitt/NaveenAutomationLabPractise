package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {
	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader("C:\\Users\\ABI\\eclipse-workspace\\NaveenAL\\src\\test\\java\\com\\testdata\\TestDataGrid.xlsx");
		System.out.println(reader.getCellData("RegTest", 1, 2));
		for(int ro=2;ro<=reader.getRowCount("RegTest");ro++)
		{
			System.out.println(reader.getCellData("RegTest", "firstname", ro));

		}
		/*WebDriver dr;

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		//dynamic wait
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.get("http://jqueryui.com/droppable/");*/
		
	}

}
