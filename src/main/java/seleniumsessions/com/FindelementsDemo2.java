package seleniumsessions.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindelementsDemo2 {
	
	
	
	
WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://www.geeksforgeeks.org/");
	
		
		
	}
	
	
	
	@Test
	void registrationForm() throws InterruptedException
	{
		

		List<WebElement> olist=odriver.findElements(By.tagName("a"));
	
		for(WebElement olist1:olist)
		{
			System.out.println(olist1.getText()+"--->"+olist1.getAttribute("href"));
			
		}
	
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	

}
