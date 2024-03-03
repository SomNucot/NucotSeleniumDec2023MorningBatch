package seleniumsessions.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicwaitsDemo {
	
	
	
	
	//Types of waits in selenium 
	
		//	1.static wait--->Thread.sleep();
		//	2.dynamic wait-->a)Implicitly wait
		//					 b)Explicit Wait
		//						i)WebDriverWait
		//						ii)FluentWait
			
			
	//implicitwait
	
//syntax-->driver.manage().timeouts().implicitlywait(Duration.ofSeconds(Time));
	
	
	
	//Syntax for Explicit wait
	
	//		WebDriverWait wait=new WebDriverWait(odriver, Duration.ofSeconds(3));
	//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

	
	
	/*Syntax for Explicit wait
	
			WebDriverWait wait=new WebDriverWait(odriver, Duration.ofSeconds(3));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
			
			
			By userName=By.name("username");
			By passWord=By.name("password");
			
			WebElement un=odriver.findElement(userName);
			WebElement pw=odriver.findElement(passWord);
			un.sendKeys("Admin");
			
			
			
			
			pw.sendKeys("admin123");
			

	*/
	
	
	/*			
	Types of Expectedconditions
	ExpectedCondition < WebElement >

	This condition has a web element locator as a parameter. An explicit wait can be applied to the condition that tries to find the web element in question. If the condition finds the element, it returns the element as a result. If not, the wait command tries the condition again after a short delay.

	ExpectedCondition < Boolean >

	This condition has a string parameter, and the wait command applies the condition to the parameter. If the result is true, then the value true is returned. If the result is false, the wait command tries the condition again after a short delay.

	While the explicit wait applies to the expected condition, the condition code may generate various exceptions.

	Let’s have a look at a few of the expected conditions:

	1.  elementToBeClickable(By locator)
	This condition is used to instruct a command to wait until the element is clickable by the locator.

	2. elementToBeSelected(By locator)
	This condition instructs a command to wait until the locator selects the element.

	3.presenceOfElementLocated(By locator)
	This condition instructs a command to wait until the element becomes visible or present.

	4.titleContains(String title)
	This condition is used to instruct a command to check if the title of the web element or the webpage contains the specific String or the group of characters.

	5.titleIs(String title)
	This condition is used to instruct a command to check whether the title is the String or the group of characters.

	6.urlToBe(String url)
	This condition is used to instruct a command to check if the URL of the webpage matches the expected URL.

	7. visibilityOfElementLocated(By locator)
	This condition instructs a command to wait until the element becomes visible.
	
/*/
	
	
	
	//3.Syntax for FluentWaitwait
/*	Wait<WebDriver> wait = new FluentWait<>(odriver)
	  		.withTimeout(Duration.ofSeconds(15))
	  		.pollingEvery(Duration.ofMillis(5));
	  		
	  		*/
	
	
	/*WebDriverManager.chromedriver().setup();
	WebDriver odriver=new ChromeDriver();
	odriver.manage().deleteAllCookies();
	odriver.manage().window().maximize();
	odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	//Syntax for FluentWaitwait
/*	Wait<WebDriver> wait = new FluentWait<>(odriver)
	  		.withTimeout(Duration.ofSeconds(15))
	  		.pollingEvery(Duration.ofMillis(5));
	  		
	  		*/
	
	
/*	
	
	
/*	
	
	By userName=By.xpath("//input[@name='username']");
	By passWord=By.xpath("//input[@name='password']");
	
	WebElement un=odriver.findElement(userName);
	WebElement pw=odriver.findElement(passWord);
	Wait<WebDriver> wait = new FluentWait<>(odriver)
	  		.withTimeout(Duration.ofSeconds(20))
	  		.pollingEvery(Duration.ofMillis(5));
	odriver.quit();
	un.sendKeys("Admin");
	
	pw.sendKeys("admin123");
	
	
*/	
	
	
	
	
	
	
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
		
		odriver.findElement(By.name("username")).sendKeys("Admin");
		
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		odriver.findElement(By.name("password")).sendKeys("admin123");
	
		WebDriverWait wait=new WebDriverWait(odriver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		odriver.findElement(By.className("orangehrm-login-button")).click();
		
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
