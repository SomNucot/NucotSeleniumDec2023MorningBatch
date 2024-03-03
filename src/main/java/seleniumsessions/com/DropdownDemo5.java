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

public class DropdownDemo5 {
	
	
	
WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://demo.mobiscroll.com/jquery/select/mobile-desktop-usage#");
	
		
		
	}
	
	@Test
	void dropDownHandling() throws InterruptedException
	{
		
		
		WebElement dropDown=odriver.findElement(By.xpath("//input[@id='input-picker-input']"));
		dropDown.click();
		
		Select oselect=new Select(dropDown);
		
		oselect.selectByValue("chi");
		
		Thread.sleep(3000);
		oselect.selectByVisibleText("London");
		Thread.sleep(8000);
		
		oselect.selectByIndex(1);
		Thread.sleep(8000);
		
		
		
		
		
		
		
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
