package org.greens.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLocationFinder {
	
public static void main(String[] args)	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thangadurai\\Desktop\\shatish java files\\SeleniumClassNotes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//Syntax ::   //tagname[contains(text(),'partial text')]
	
		WebElement txtForgotPassword = driver.findElement(By.xpath("//a[contains(text() ,'Forgotten account?')]"));
				
		txtForgotPassword.click();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.gmail.com");
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.quit();		
		
}

}
