package org.greens.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchingBrowserFirefox {
	
	public static void main(String[] args) {
				
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Thangadurai\\Desktop\\shatish java files\\SeleniumClassNotes\\drivers\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();	
		
		System.out.println("TITLE = "+title);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("URL = "+currentUrl);		
		
		driver.quit();
		
	
	}
	

}
