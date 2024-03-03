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

public class DropDownDemo2 {
	
	

	WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	
		
		
	}
	
	@Test
	void dropDownHandling() throws InterruptedException
	{
		
		
		WebElement dropDown=odriver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']"));
		dropDown.click();
		
		Select oselect=new Select(dropDown);
		
		oselect.selectByValue("Radio-1");
		
		Thread.sleep(3000);
		oselect.selectByVisibleText("Evening");
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
