package org.greens.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQaTest {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thangadurai\\Desktop\\shatish java files\\SeleniumClassNotes\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/?firstname=&lastname=&exp=3&photo=&tool=Selenium+IDE&tool=Selenium+Webdriver&continents=South+America&submit=");
		
		driver.manage().window().maximize();
		
		WebElement txtPLN = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[2]/a/strong"));
		
		txtPLN.click();
		
		WebElement txtLT = driver.findElement(By.xpath("//strong[text()='Link Test']"));
		
		txtLT.click();
		
		driver.navigate().back();
		
		WebElement inputFirstName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
		
		inputFirstName.sendKeys("Shatish");
		
		WebElement inputLastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		inputLastName.sendKeys("Kumar");
		
		WebElement btnMale = driver.findElement(By.xpath("//input[@id='sex-0']"));
		
		btnMale.click();		
		
		WebElement btnExp2 = driver.findElement(By.id("exp-2"));
		
		btnExp2.click();
		
		WebElement txtDate = driver.findElement(By.id("datepicker"));
		
		txtDate.click();	
		
		WebElement btnAutomation = driver.findElement(By.id("profession-1"));
		
		btnAutomation.click(); 
		
		WebElement btnSeleniumWD = driver.findElement(By.id("tool-2"));
		
		btnSeleniumWD.click();  
		
		WebElement dropDownCont = driver.findElement(By.xpath("//select[@id='continents']"));
		
		dropDownCont.click();
		
		Robot r= new Robot();
		
		//r.keyPress(KeyEvent.VK_DOWN);		
		//r.keyRelease(KeyEvent.VK_DOWN);
		
		//r.keyPress(KeyEvent.VK_DOWN);		
		//r.keyRelease(KeyEvent.VK_DOWN);
		
		//r.keyPress(KeyEvent.VK_DOWN);		
		//r.keyRelease(KeyEvent.VK_DOWN);
		
		//r.keyPress(KeyEvent.VK_DOWN);		
		//r.keyRelease(KeyEvent.VK_DOWN);
		
		for (int i = 0; i < 4; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);		
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);		
		r.keyRelease(KeyEvent.VK_ENTER);	
		
		
		
		WebElement btnButton = driver.findElement(By.name("submit"));
		
		btnButton.click();
		Thread.sleep(3000);
		
		WebElement printText = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[1]/p[2]/span/em"));
		
		String j = printText.getText();
		
		System.out.println(j);
		
	}
}
