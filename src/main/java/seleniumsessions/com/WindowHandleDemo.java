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

public class WindowHandleDemo {
	
	/* window handle? 
			A window handle is a unique identifier that holds the address of all the windows. This is basically a pointer to a window, which returns the string value. This window handle function helps in getting the handles of all the windows. It is guaranteed that each browser will have a unique window handle.

Syntax
get.windowhandle():--> helps in getting the window handle of the current window
get.windowhandles():--> helps in getting the handles of all the windows opened
set:--> helps to set the window handles which is in the form of a string.  set<string> set= driver.get.windowhandles()
switch to: -->helps in switching between the windows
action: -->helps to perform certain actions on the windows.

	*/
	
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
		
		////a[@href='https://resume.naukri.com/?fftid=100001']
		WebElement services=odriver.findElement(By.xpath("//div[text()='Services']"));
		
		services.click();
		
		//get the window ids
		
		Set<String> ohandle=odriver.getWindowHandles();
		
		
		Iterator<String> it=ohandle.iterator();
		
		String parentWindowId=it.next();
		System.out.println("Parent window id is ---->"+parentWindowId);
		
		
		String childWindowId=it.next();
		System.out.println("child window id is ---->"+childWindowId);
		
		
		//switching to window
		
		odriver.switchTo().window(childWindowId);
		
		String title=odriver.getTitle();
		System.out.println(title);
		
		String url=odriver.getCurrentUrl();
		System.out.println(url);
		
		odriver.close();
		
		
		odriver.switchTo().window(parentWindowId);
		
		String parenttitle=odriver.getTitle();
		System.out.println(parenttitle);
		
		String parenturl=odriver.getCurrentUrl();
		System.out.println(parenturl);
		odriver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	@AfterSuite
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	

}
