package Aug.Sunday;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class SundayTest {
  @Test
  public void sundayTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.get("https://www.dal.ca");
		driver.findElement(By.linkText("About")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='text parbase section'])[1]/p")).getText());
	  driver.findElement(By.linkText("Services for current students")).click();
	  driver.findElement(By.linkText("Dalhousie Tigers")).click();
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  
	  jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[contains(text(),'Throwback Thursday (Aug 1)')])[2]")));
	  
	  driver.findElement(By.xpath("(//*[contains(text(),'Throwback Thursday (Aug 1)')])[2]")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

}
