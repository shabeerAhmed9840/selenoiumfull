package robo;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import javax.swing.Box.Filler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import baseclass.Base;

public class Demorobo extends Base{
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement x = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		x.click();
		Thread.sleep(3000);
		
		Thread.sleep(5000);
		WebElement a=driver.findElement(By.xpath("//input[@type='text']"));
		a.sendKeys("iphone",Keys.ENTER);
		Thread.sleep(3000);
		WebElement w = driver.findElement(By.xpath("//a[@class='_2cLu-l']"));
		
		Actions a1=new Actions(driver);
		//a.moveToElement(redmi);
		a1.contextClick(w);
		a1.perform();
		
		Robot r =new Robot();
		for (int i = 0; i <=3; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
			}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		/*
		windowHandel(driver);
		WebElement c = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		c.click();*/
		}

}
