package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumSample\\driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.irctc.co.in/");
	WebElement txtUser = d.findElement(By.xpath("(//input[@type='text'])[1]"));
	txtUser.sendKeys("123456");
	WebElement to=d.findElement(By.xpath("(//input[@type='text'])[2]"));
	to.sendKeys("12345");
	WebElement seat=d.findElement(By.xpath("(//label[@style='color: #082b71;'])[3]"));
	seat.click();
	WebElement btn=d.findElement(By.xpath("//button[@label='Find Trains']"));
	btn.click();
	
	
	}
	
	
	
	
	}


