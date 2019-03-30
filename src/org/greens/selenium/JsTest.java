package org.greens.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JsTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thangadurai\\Desktop\\shatish java files\\SeleniumClassNotes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement txtuser = driver.findElement(By.id("email"));
		
		js.executeScript("arguments[0].setAttribute('value','Hello')", txtuser);
		
		Thread.sleep(300l);
		
		String name = (String) js.executeScript("return arguments[0].getAttribute('value')", txtuser);
		
		System.out.println(name);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		
		js.executeScript("arguments[0].setAttribute('value', 'GREENS')", txtPass);
		
		Thread.sleep(300l);
		
		WebElement scrollDown = driver.findElement(By.xpath("//a[@title='Tamil']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		
		scrollDown.click();
		
		
	
	}
}
