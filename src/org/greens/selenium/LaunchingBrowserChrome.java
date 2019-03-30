package org.greens.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowserChrome {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shatish\\Desktop\\Testing\\shatish Project Files\\SeleniumClassNotes\\drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();

		System.out.println("TITLE = "+title);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("CurrentURL = "+currentUrl);
		
		driver.quit();
		
	}

}
