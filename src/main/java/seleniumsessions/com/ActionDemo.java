package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo {
	
	//Action class
	/*
	Mouse Actions in Selenium:

		doubleClick(): Performs double click on the element
		clickAndHold(): Performs long click on the mouse without releasing it
		dragAndDrop(): Drags the element from one point and drops to another
		moveToElement(): Shifts the mouse pointer to the center of the element
		contextClick(): Performs right-click on the mouse
		Keyboard Actions in Selenium:

		sendKeys(): Sends a series of keys to the element
		keyUp(): Performs key release
		keyDown(): Performs keypress without release
	
*/
	
	WebDriver odriver;
	
	@Test
	void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://www.google.com/");
		
		WebElement oleme=odriver.findElement(By.name("q"));
		Thread.sleep(3000);
		
		//create object of action class and pass driver as argument
		Actions action = new Actions(odriver);
		action.keyDown(oleme, Keys.SHIFT).sendKeys("bangalore").build().perform();
		Thread.sleep(8000);
		
		
		
		
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	@AfterSuite
	void test8()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
