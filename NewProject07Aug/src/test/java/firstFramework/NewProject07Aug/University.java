package firstFramework.NewProject07Aug;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class University {
	@Test
	  public void canadaGov() {
		  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			driver.get("http://www.cic.gc.ca");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("English")).click();
			driver.findElement(By.linkText("Visit")).click();
			driver.findElement(By.linkText("Apply for a visitor visa")).click();
			System.out.println(driver.findElement(By.xpath("//div[@class='col-xs-auto']/div[1]/p[1]")).getText());
           
           driver.findElement(By.linkText("Next: Who can apply")).click();
           driver.findElement(By.linkText("Next: How to apply")).click();
           
           Select obj1= new Select(driver.findElement(By.id("wb-auto-13")));
           obj1.selectByVisibleText("Outside Canada");
           Select obj2= new Select(driver.findElement(By.id("wb-auto-22")));
           obj2.selectByVisibleText("Online");
           driver.findElement(By.xpath("//input[@type='submit']")).click();
           driver.findElement(By.linkText("Apply for a visitor visa")).click();
           List<WebElement> webElement1 = driver.findElements(By.xpath("//nav[@class='container wb-navcurr']/ul/li"));
   		System.out.println(webElement1.size());
   		for (int i = 0; i < webElement1.size(); i++) {
   			System.out.println(webElement1.get(i).getText());
	}
	}	

}
