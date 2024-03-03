package seleniumsessions.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	WebDriver odriver;
	
	@BeforeSuite
	void test1()
	{
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://www.amazon.com");
	
		
		
	}
	
	
	
	
	@Test
	void test11()
	{
		
		
		String actualTitle=odriver.getTitle();
		
		System.out.println(actualTitle);
		
		//validation
		String expectedTitle="Amazon.com. Spend less. Smile more.";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
		
		
	}
	
	
	
	
	@AfterSuite
	void test8()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	

}
