package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo2 {
	
	
	//2.Position based-->index based
	
	//--->(//label[@class='oxd-label'])[1]
	
	
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
	void cregistrationForm() throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		String usernamelabel=odriver.findElement(By.xpath("(//label[@class='oxd-label'])[1]")).getText();
		System.out.println(usernamelabel);
		
		Thread.sleep(3000);
		odriver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(3000);
		
		String passwordlabel=odriver.findElement(By.xpath("(//label[@class='oxd-label'])[2]")).getText();
		System.out.println(passwordlabel);
		
		odriver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);

		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	

}
