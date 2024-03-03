package seleniumsessions.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {
	
/*
	1. selectByVisibleText: selectByVisibleText(String arg0): void
	This select class method is used to select one of the options in a drop-down box or an option among multiple selection boxes. It takes a parameter of String which is one of the values of Select element and it returns nothing.

	Syntax:

	obj.Select.selectByVisibleText(“text”);
	Example:

	Select objSelect =new Select(driver.findElement(By.id("search-box")));
	objSelect.selectByVisibleText("Automation");
	2. selectByIndex: selectByIndex(int arg0) : void
	This method is similar to ‘selectByVisibleText’, but the difference here is that the user has to provide the index number for the option rather than text. It takes the integer parameter which is the index value of Select element and it returns nothing.

	Syntax:

	oSelect.selectByIndex(int);
	Example:

	Select objSelect = new Select(driver.findElement(By.id("Seacrch-box")));
	Select.selectByIndex(4);
	3. selectByValue: selectByValue(String arg0) : void
	This method asks for the value of the desired option rather than the option text or an index. It takes a String parameter which is one of the values of Select element and it does not return anything.

	Syntax:

	oSelect.selectByValue(“text”);
	Example:

	Select objSelect = new Select(driver.findElement(By.id("Search-box")));
	objSelect.selectByValue("Automation Testing");
	4. getOptions: getOptions( ) : List<WebElement>
	This method gets all the options belonging to the Select tag. It takes no parameter and returns List<WebElements>.

	Syntax:

	oSelect.getOptions();
	Example:

	Select objSelect = new Select(driver.findElement(By.id("Search-box")));
	List <WebElement> elementCount = oSelect.getOptions();
	System.out.println(elementCount.size());
	5. deselectAll()
	This method clears all the selected entries. This is only valid when the drop-down element supports multiple selections.

	Syntax:

	objSelect.deselectAll();
	Now let’s delve deeper to understand how to select multiple items with the Select command.
	
	
	*/
	
	
	
	WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://the-internet.herokuapp.com/dropdown");
	
		
		
	}
	
	@Test
	void dropDownHandling() throws InterruptedException
	{
		
		
		WebElement dropDown=odriver.findElement(By.xpath("//select[@id='dropdown']"));
		dropDown.click();
		
		Select oselect=new Select(dropDown);
		
		oselect.selectByValue("1");
		
		Thread.sleep(3000);
		oselect.selectByVisibleText("Option 2");
		Thread.sleep(8000);
		
		oselect.selectByIndex(1);
		Thread.sleep(8000);
		
		
		
		List<WebElement> olist=oselect.getOptions();
		
		System.out.println(olist.size());
		
		for(WebElement newolist:olist)
		{
			System.out.println(newolist.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	@AfterMethod
	void closeAPP()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
