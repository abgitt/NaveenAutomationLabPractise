package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJet {

	public static void main(String[] args) {
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		//dynamic wait
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		dr.get("https://spicejet.com/");
		Actions action = new Actions(dr);
		dr.switchTo().parentFrame();
		action.moveToElement(dr.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
		//action.moveToElement(dr.findElement(By.partialLinkText("SpiceClub"))).build().perform();
		action.moveToElement(dr.findElement(By.linkText("SpiceClub Members"))).build().perform();
		//dr.findElement(By.linkText("SpiceClub Members")).click();;

	}

}
