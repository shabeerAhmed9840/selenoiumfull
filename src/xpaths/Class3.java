package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumSample\\driver\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	
	w.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	
	Thread.sleep(5000);
	
	WebElement text=w.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]"));
	text.sendKeys("ShabeerAhmed");
	
	WebElement pass=w.findElement(By.xpath("(//input[@type='password'])[1]"));
	pass.sendKeys("12345678");
	
	WebElement fb=w.findElement(By.xpath("//span[@class='KPnG0']"));
	fb.click();
	
	WebElement login=w.findElement(By.xpath("(//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt'])[1]"));
	login.sendKeys("mustag.s.ahmed@gmail.com");
	
	WebElement fbpass=w.findElement(By.xpath("(//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt'])[2]"));
	fbpass.sendKeys("mynameiscoolkhan");
	
	WebElement fbbtn=w.findElement(By.xpath("//button[@value='1']"));
	fbbtn.click();
	
	
	
	
	
	
	
	}

}
