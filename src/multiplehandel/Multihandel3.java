package multiplehandel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import baseclass.Base;

public class Multihandel3 extends Base{
	public static void main(String[] args) throws InterruptedException {
		launch("https://www.flipkart.com/");
		WebElement x = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		x.click();
		Thread.sleep(3000);
		
		Thread.sleep(5000);
		 
		WebElement a=driver.findElement(By.xpath("//input[@type='text']"));
		a.sendKeys("iphone",Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
