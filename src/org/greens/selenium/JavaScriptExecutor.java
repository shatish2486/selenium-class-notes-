package org.greens.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thangadurai\\Desktop\\shatish java files\\SeleniumClassNotes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		WebElement txtuser = driver.findElement(By.id("email"));
		
		js.executeScript("arguments[0].setAttribute('value','Hello')", txtuser);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		
		js.executeScript("arguments[0].setAttribute('value', 'GREENS')", txtpass);
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		js.executeScript("arguments[0].click()", btnLogin);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https:www.gmail.com");
		
		driver.quit();
		
	}



}
