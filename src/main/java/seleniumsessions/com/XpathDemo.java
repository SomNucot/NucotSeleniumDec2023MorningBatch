package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {
	
	
	//By.xpath-->its not attribute but its the address of the webelement in the DOM
	
	//two types of xpath namely
	//1.Absolute xpath-->/
	//exmple-->/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[2]/input[1]
	//2.Relative xpath-->//

	
	//syntax for xpath
	//-->1-->//tagName[@attribute='value']
	//input[@name='username']
	//*[@name='username']
	//input[@placeholder ='Username']
	
	//input[@name='username']
	
	
	
	

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
	void cregistrationForm() throws InterruptedException
	{
		
		Thread.sleep(3000);
		odriver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		
		Thread.sleep(3000);
		
		odriver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
