package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartLogin {
	
	
WebDriver odriver;
	
	
	@BeforeMethod
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://www.flipkart.com/");
	
		
		
	}
	
	@Test
	void agetTitleOfThePage()
	{
		
		String actualTitle=odriver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		//validation
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}
	
	@Test
	void bgetCurrentUrlOfThePage()
	{
		String actualUrl=odriver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl="https://www.flipkart.com/";
		//validation
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	@Test
	void cregistrationForm() throws InterruptedException
	{
		
		
		Thread.sleep(3000);
		odriver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		odriver.findElement(By.className("VJZDxU")).sendKeys("9986453663");
		Thread.sleep(5000);
		
		
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	

}
