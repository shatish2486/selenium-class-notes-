package org.greens.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAttribute {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thangadurai\\Desktop\\shatish java files\\SeleniumClassNotes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtNew = driver.findElement(By.xpath("//span[contains(text(),'Create')]"));
		
		String name = txtNew.getText();
		
		System.out.println(name);
		
		WebElement txtUserInput = driver.findElement(By.id("email"));
		
		txtUserInput.sendKeys("awerqfa@gmail.com");
		
		String userInput = txtUserInput.getAttribute("value");
		
		System.out.println(userInput);
		
		driver.quit();
	}

}
