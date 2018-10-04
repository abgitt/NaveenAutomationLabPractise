package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynaicWebTableHandle {

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
	//	dr.findElement(By.xpath("//input[@type='submit']")).click();
		dr.switchTo().frame(1);
	//	dr.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();;
		JavascriptExecutorConcept.clickElement(dr, dr.findElement(By.xpath("//ul/li/a[contains(text(),'Contacts')]")),js);
		//form[@id='vContactsForm']/table[@class='datacard']//tr[4]/td[2]
		String bFrXpath = "//form[@id='vContactsForm']/table[@class='datacard']//tr[";
		String aFTRXpath = "]/td[2]/a";
		for(int i=4;i<=7;i++)
		{
			String xpath_expr =  bFrXpath+i+aFTRXpath;
			String name = dr.findElement(By.xpath(xpath_expr)).getText();
			System.out.println(name);
			if(name.contains("Naga Bhushanam G") || name.contains("Mamatha G"))
			{
				dr.findElement(By.xpath(bFrXpath+i+"]/td[1]")).click();
			}
		}
		dr.findElement(By.xpath("//a[contains(text(),'Mamatha G')]/parent::td/preceding-sibling::td/input")).click();
		dr.findElement(By.xpath("//a[contains(text(),'Mamatha G')]/parent::td/following-sibling::td/following-sibling::td")).click();
		dr.findElement(By.xpath("//a[contains(text(),'Mamatha G')]/parent::td/following-sibling::td/following-sibling::td/input")).sendKeys("8985837814");
		dr.findElement(By.xpath("//a[contains(text(),'Mamatha G')]/parent::td/following-sibling::td/following-sibling::td/input[@type='button']")).click();
		dr.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	}

}
