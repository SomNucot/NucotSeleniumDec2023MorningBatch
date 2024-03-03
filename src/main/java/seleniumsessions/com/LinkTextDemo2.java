package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextDemo2 {
	
	

	WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://app.hubspot.com/login");
	
		
		
	}
	
	@Test
	void agetTitleOfThePage()
	{
		
		String actualTitle=odriver.getTitle();
		String expectedTitle="HubSpot Login";
		//validation
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}
	
	@Test
	void bgetCurrentUrlOfThePage()
	{
		String actualUrl=odriver.getCurrentUrl();
		String expectedUrl="https://app.hubspot.com/login";
		//validation
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	@Test
	void cregistrationForm() throws InterruptedException
	{
		
		Thread.sleep(3000);
		odriver.findElement(By.id("username")).sendKeys("Admin");
		
		Thread.sleep(3000);
		
		odriver.findElement(By.id("password")).sendKeys("admin123");
		Thread.sleep(3000);
		
		odriver.findElement(By.linkText("Forgot my password")).click();
		Thread.sleep(3000);
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
