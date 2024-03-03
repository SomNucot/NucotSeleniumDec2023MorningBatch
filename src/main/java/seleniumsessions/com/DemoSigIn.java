package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSigIn {
	
	
	
	WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://squareup.com/signup/us?lang_code=en-us&v=online-store");
	
		
		
	}
	
	@Test
	void registrationForm() throws InterruptedException
	{
		
		Thread.sleep(3000);
		String firstName=odriver.findElement(By.xpath("//label[@for='first-name']")).getText();
		System.out.println(firstName);
		
		odriver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Nucot");
		//third way using text() method
		//tagName[text()='value']
		
		String lastName=odriver.findElement(By.xpath("//label[text()='Last name']")).getText();
		System.out.println(lastName);
		
		odriver.findElement(By.xpath("//input[@name='last-name']")).sendKeys("Bangalore");
		
		Thread.sleep(3000);
		
		
		//4th way
		
		//-->//tagName[contains(@attribute,'value')]
		//--->//tagName[contains(text(),'Value')]
		
		String email=odriver.findElement(By.xpath("//label[contains(text(),'Enter your email')]")).getText();
		System.out.println(email);
		
		odriver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@nucot.com");
		
		
		
		
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
