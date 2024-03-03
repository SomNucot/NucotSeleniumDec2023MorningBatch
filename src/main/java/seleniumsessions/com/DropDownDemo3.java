package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo3 {
	
WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://mdbootstrap.com/docs/standard/extended/dropdown-checkbox/");
	
		
		
	}
	
	@Test
	void dropDownHandling() throws InterruptedException
	{
		
		
		WebElement dropDown=odriver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		dropDown.click();
		
		WebElement dropDownoValue=odriver.findElement(By.xpath("//input[@id='Checkme1']"));
		
		dropDownoValue.click();
		Thread.sleep(3000);
		WebElement dropDownoValue2=odriver.findElement(By.xpath("//input[@id='Checkme3']"));
		
		dropDownoValue2.click();
		Thread.sleep(3000);
		
		
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	

}
