package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectorDemo {
	
	//syntax
	/*
	 * 
	 * 
	 *1.
			 * tagname#id_value
			 * input#username
			  
			2.
				#id_value
				#username

			3.
				tagname[id=’<id value>’]
 				input[id=username]
 				tagname[class=’<class value>’]
 				input[class=username]
 				tagname[name=’<name value>’]
 				input[name=username]
 				
 				
 				
 				
 			4.tagname.class_value   -->note:if class value has space use dot
 			input.form-control.private-form__control.login-email
	 * 
	 * 
	 */
	
	
	
	
	
	
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
	void registrationForm() throws InterruptedException
	{
		
		//<tagname>#<id value>
		
		//input#id username
		
		Thread.sleep(3000);
		odriver.findElement(By.cssSelector("input#username")).sendKeys("Admin");
		
		Thread.sleep(3000);
		
		odriver.findElement(By.cssSelector("input#password")).sendKeys("admin123");
		Thread.sleep(3000);
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
