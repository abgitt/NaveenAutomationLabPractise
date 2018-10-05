package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalanderTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		JavascriptExecutor js = ((JavascriptExecutor) dr);
		dr.get("https://www.freecrm.com/");
		dr.findElement(By.name("username")).sendKeys("abgitt");
		dr.findElement(By.name("password")).sendKeys("B4itfun!");
		JavascriptExecutorConcept.clickElement(dr, dr.findElement(By.xpath("//input[@type='submit']")), js);
		dr.switchTo().frame(1);
		Select month = new Select(dr.findElement(By.xpath("//select[contains(@name,'slctMonth')]")));
		month.selectByVisibleText("June");
		Select year = new Select(dr.findElement(By.xpath("//select[contains(@name,'slctYear')]")));
		year.selectByVisibleText("2017");
		String bFrXpath = "//div[@id='crmcalendar']//table/tbody//table//tr[";
		String aFtrXp = "]/td[";
		for(int rowCount = 2;rowCount <= 7;rowCount++)
		{
			for(int colCount = 1;colCount <= 7; colCount++)
			{
				String day = "31";
				

					
					try
					{
						if(dr.findElement(By.xpath(bFrXpath+rowCount+aFtrXp+colCount+"]")).getText().equals(day))
						{
							System.out.println((dr.findElement(By.xpath(bFrXpath+rowCount+aFtrXp+colCount+"]")).getText()));

							dr.findElement(By.xpath(bFrXpath+rowCount+aFtrXp+colCount+"]")).click();
						}
					}
					catch(Exception e)
					{
						System.out.println("No date");
						System.out.println(e.getMessage());
					}	
				}
			
			}
		}

	

}
