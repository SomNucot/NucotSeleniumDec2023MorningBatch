package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo2 {
	
	
	
WebDriver odriver;
	
	@Test
	void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		
		WebElement oleme=odriver.findElement(By.id("FirstName"));
		oleme.sendKeys("bangalore");
		
		//create object of action class and pass driver as argument
		Actions action = new Actions(odriver);
		
		//Windows---Keys.CONTROL
		action.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
		action.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
		
		WebElement oleme2=odriver.findElement(By.id("LastName"));
		oleme2.click();
		
		action.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		
		
		
		Thread.sleep(8000);
		
		
		
		
		
	
	
	}
	

	@AfterSuite
	void test8()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	

}
