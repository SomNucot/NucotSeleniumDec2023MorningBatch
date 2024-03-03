package seleniumsessions.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowDemo2 {
	
	
WebDriver odriver;
	
	
	@BeforeSuite
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://www.naukri.com/");
	
		
		
	}
	
	
	@Test
	void registrationForm() throws InterruptedException
	{
		
		

		// It will return the parent window name as a String
		String parent=odriver.getWindowHandle();

		Set<String>s=odriver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

			String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		odriver.switchTo().window(child_window);

		System.out.println(odriver.switchTo().window(child_window).getTitle());

		odriver.close();
		}

		}
		//switch to the parent window
		odriver.switchTo().window(parent);

		
		
		
		
		
	}
	
	
	@AfterSuite
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
