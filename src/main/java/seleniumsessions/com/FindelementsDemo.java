package seleniumsessions.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindelementsDemo {
	
	
	
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
	void registrationForm() throws InterruptedException
	{
		
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement un=odriver.findElement(By.name("username"));
		un.sendKeys("Admin");
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement pw=odriver.findElement(By.name("password"));
		pw.sendKeys("admin123");
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		List<WebElement> olist=odriver.findElements(By.tagName("a"));
	
		for(WebElement olist1:olist)
		{
			System.out.println(olist1.getText());
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
