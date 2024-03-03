package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextDemo {
	
	
	WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
		
	}
	
	@Test
	void agetTitleOfThePage()
	{
		
		String actualTitle=odriver.getTitle();
		String expectedTitle="OrangeHRM";
		//validation
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}
	
	@Test
	void bgetCurrentUrlOfThePage()
	{
		String actualUrl=odriver.getCurrentUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		//validation
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	@Test
	void cregistrationForm() throws InterruptedException
	{
		
		Thread.sleep(3000);
		odriver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(3000);
		
		odriver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		
		odriver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(3000);
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
