package javaS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nov29 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumSample\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement down=driver.findElement(By.xpath("//input[@name='email']"));
		js.executeScript("arguments[0].setAttribute('value','xyz2gmail.com');",down);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		js.executeScript("aruguments[0].setAttribute('value','123456789');",pass);
		
		WebElement log=driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("aruguments[0].click();",log);
		
		
		
		
		
		
		
		
		
		
	}

}
