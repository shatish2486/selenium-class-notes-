package org.greens.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test{


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shatish\\Desktop\\Testing\\shatish Project Files\\SeleniumClassNotes\\drivers\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.xpath("//a[@class='activeLink']"));
	
		Actions acc = new Actions(driver);
		
		acc.moveToElement(input).perform();
		
		WebElement course = driver.findElement(By.xpath("//span[text()='Cloud Computing']"));
		
		course.click();
		
		WebElement findText = driver.findElement(By.xpath("(//p[@class='subHead marB20'])[1]"));
		
		System.out.println(findText.getText());		
		
		input.sendKeys("shatishkumar17@gmail.com");
		
		System.out.println(input.getAttribute("value"));
	
		driver.navigate().to("https://wwww.facebook.com");
		
		System.out.println(driver.getTitle());
				
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();		
		
		
		
		
		
		
	}

}
