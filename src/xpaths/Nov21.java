package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nov21 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumSample\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	
	Thread.sleep(2000);
	
	WebElement click=driver.findElement(By.xpath("//a[@href='contact.php']"));
	
	click.click();
	
	WebElement name=driver.findElement(By.xpath("//input[@id='InputName']"));
	
	name.sendKeys("Ahmed");
	
	WebElement email=driver.findElement(By.xpath("//input[@id='InputEmail1']"));
	
	email.sendKeys("xyz@gmail.com");
	
	
	WebElement num=driver.findElement(By.name("phone"));
	
	num.sendKeys("9600000000");
	
	WebElement cou=driver.findElement(By.xpath("(//select[@name='courses'])[1]"));
	
	cou.sendKeys("Java");
	
	WebElement loc=driver.findElement(By.xpath("(//select[@name='branch'])[1]"));
	
	loc.sendKeys("OMR");
	
	WebElement time=driver.findElement(By.xpath("(//select[@name='time'])[1]"));
	
	time.sendKeys("Immediately");
	
	WebElement msg=driver.findElement(By.xpath("(//textarea[@name='comments'])[1]"));
	
	msg.sendKeys("We love Java");
	
	WebElement btn=driver.findElement(By.xpath("(//button[@name='submit'])[1]"));
	btn.click();
	
	
	
	
	
	
	
	}

}
