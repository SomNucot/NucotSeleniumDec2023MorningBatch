package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {
	
	WebDriver odriver;
	
	
	@BeforeSuite
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	
		
		
	}
	
	@Test
	void getTitleOfThePage()
	{
		
		String title=odriver.getTitle();
		System.out.println(title);
		
		
	}
	
	@Test
	void getCurrentUrlOfThePage()
	{
		String url=odriver.getCurrentUrl();
		System.out.println(url);
		
	}
	@Test
	void registrationForm() throws InterruptedException
	{
		
		odriver.findElement(By.id("RESULT_TextField-1")).sendKeys("Nucot company");
		
		Thread.sleep(3000);
		
		odriver.findElement(By.id("RESULT_TextField-2")).sendKeys("Bangalore");
		Thread.sleep(3000);
		odriver.findElement(By.id("RESULT_TextField-3")).sendKeys("9986453663");
		Thread.sleep(3000);
		odriver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
		Thread.sleep(3000);
		odriver.findElement(By.id("RESULT_TextField-5")).sendKeys("Bangalore");
		Thread.sleep(3000);
		odriver.findElement(By.id("RESULT_TextField-6")).sendKeys("Bangalore@gmail.com");
		Thread.sleep(3000);
		
	}
	
	
	@AfterSuite
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	

}
