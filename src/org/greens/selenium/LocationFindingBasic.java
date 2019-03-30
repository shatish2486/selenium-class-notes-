package org.greens.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationFindingBasic {
	
	public static void main(String[] args)	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thangadurai\\Desktop\\shatish java files\\SeleniumClassNotes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
	
		WebElement txtUserInput = driver.findElement(By.id("email"));		
		
		txtUserInput.sendKeys("awerqfa@gmail.com");		

		WebElement txtPassInput = driver.findElement(By.id("pass"));		
		
		txtPassInput.sendKeys("1234567890");
		
		WebElement btnMale = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		
		btnMale.click();
		
		WebElement btnNext = driver.findElement(By.xpath("//input[@type='submit']"));
		
		btnNext.click();		
		
		driver.quit();
		
		
	}

}
