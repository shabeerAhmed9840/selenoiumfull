package xpaths;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiprint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
        WebElement btn = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		btn.click();
		Thread.sleep(5000);
		WebElement a=driver.findElement(By.xpath("//input[@type='text']"));
		a.sendKeys("iphone",Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> i = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		int size = i.size();
		System.out.println(size);
		for (int j = 0; j < i.size(); j++) {
			WebElement w = i.get(j);
			String text = w.getText();
			System.out.println(text);
			
		}

	
	
	
	
	}
}
