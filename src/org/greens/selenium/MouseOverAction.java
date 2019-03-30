package org.greens.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOverAction {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thangadurai\\Desktop\\shatish java files\\SeleniumClassNotes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement locCourses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions acc = new Actions(driver);
		
		acc.moveToElement(locCourses).perform();

		WebElement locEthical = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/ul/li[3]/a/span[1]"));
			
		Actions bcc = new Actions(driver);
		bcc.moveToElement(locEthical).perform();
		//bcc.click();
		
		WebElement performanceTuning = driver.findElement(By.xpath("//span[text()='Performance Tuning Training']"));
		
		Actions ccc=new Actions(driver);
		
		ccc.moveToElement(performanceTuning).click().perform();		
		
		driver.quit();	
		
		
		
	}

}
