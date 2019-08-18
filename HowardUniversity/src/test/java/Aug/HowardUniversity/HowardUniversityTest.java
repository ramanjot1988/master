package Aug.HowardUniversity;

import org.testng.annotations.Test;

import commonUtilities.Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class HowardUniversityTest {
	Utilities utils = new Utilities();
	
  @Test
  public void howardUniversity() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	
		driver.get("https://home.howard.edu");
		driver.findElement(By.partialLinkText("Apply")).click();
		driver.findElement(By.linkText("Admission")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='footer_left_menu']/li[8]/ul/li/a"));
		utils.printWebElementList(list);
		Thread.sleep(3000);
		utils.printWebElementList(driver.findElements(By.xpath("(//div[@class='view-content'])[8]/div[2]/p")));
		Thread.sleep(6000);
		utils.printWebElementList(driver.findElements(By.xpath("(//div[@class='view-content'])[8]/div[4]/p")));
		
		
  }
  @BeforeMethod
  public void beforeMethod() {
  }

}
