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

public class ActionDemo3 {
	
	
	
	WebDriver odriver;
	
	@Test
	void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		

		//create object of action class and pass driver as argument
		
		//scrolldown using action
		Actions action = new Actions(odriver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		Thread.sleep(8000);
		//scroll up
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
	}
	

	@AfterSuite
	void test8()
	{
		odriver.quit();
	}
	
	
	

}
