package seleniumsessions.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommandsDemo {
	
	
	
WebDriver odriver;
	
	
	
	
	@Test
	void registrationForm() throws InterruptedException
	{
		
		odriver=new ChromeDriver();
		
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.navigate().to("https://www.google.com");

		odriver.navigate().back();
		
		odriver.navigate().to("https://www.filpkart.com");
		
		odriver.navigate().back();
		
		odriver.navigate().to("https://www.amazon.com");
		odriver.navigate().back();
		odriver.navigate().forward();
		
		odriver.navigate().refresh();
		odriver.close();
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
