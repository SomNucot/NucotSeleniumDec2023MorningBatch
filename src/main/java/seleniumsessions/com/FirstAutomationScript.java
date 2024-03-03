package seleniumsessions.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationScript {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://www.amazon.com");
	
		odriver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
