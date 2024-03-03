package seleniumsessions.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsDeme {
	
	
WebDriver odriver;
	
	
	
	
	@Test
	void registrationForm() throws InterruptedException
	{
		
		odriver=new ChromeDriver();
		
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		odriver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		WebElement jsAlert=odriver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		
		jsAlert.click();
		
		
		Alert jsalert=odriver.switchTo().alert();
		String textInJsAlert=jsalert.getText();
		System.out.println(textInJsAlert);
		
		jsalert.accept();
		
		WebElement jsConfirm=odriver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		
		jsConfirm.click();
		
		
		Alert jsconfirm=odriver.switchTo().alert();
		String textInJsConfirm=jsconfirm.getText();
		System.out.println(textInJsConfirm);
		
		jsalert.dismiss();
		
		WebElement jsPrompt=odriver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		jsPrompt.click();
		
		
		Alert jsprompt=odriver.switchTo().alert();
		String textInJsPrompt=jsprompt.getText();
		System.out.println(textInJsPrompt);
		jsprompt.sendKeys("Bangalore");
		
		jsalert.accept();
		
		
		
	
		
		odriver.close();
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
