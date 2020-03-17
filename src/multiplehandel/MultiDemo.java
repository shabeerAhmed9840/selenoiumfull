package multiplehandel;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import webhand.WebHandDemo;

public class MultiDemo extends WebHandDemo{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		WebElement a=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		Thread.sleep(5000);
		a.sendKeys("iphone11",Keys.ENTER);
		Thread.sleep(5000);
		WebElement a2=driver.findElement(By.xpath("//p[text()='Apple iPhone 11 Bumper Cases Dee Brand - Transparent']"));
		a2.click();
		String par=driver.getWindowHandle();
				System.out.println(par);
		Set<String>child=driver.getWindowHandles();
		System.out.println(child);
		
		for(String child0 :child){
			if(!par.equals(child0)) {
				driver.switchTo().window(child0);
				System.out.println(child0);
			}
		}
		WebElement a3=driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
		a3.click();
		
		Set<String>child1=driver.getWindowHandles();
		System.out.println(child1);
		
		List<String>li=new LinkedList<>();
		li.addAll(child1);
		String sr = li.get(2);
		driver.switchTo().window(sr);
		System.out.println(sr);
		Thread.sleep(5000);		
		WebElement a4=driver.findElement(By.xpath("//p[text()='Help Center']"));
		a4.click();
		
		int count=0;
		Set<String>child2=driver.getWindowHandles();
		System.out.println(child2);
		for(String child3:child2) {
			if(count==2) {
				driver.switchTo().window(child3);
				System.out.println(child3);
			}
			count++;
			}
		Thread.sleep(3000);
		WebElement a5=driver.findElement(By.xpath("//input[@class='col-xs-21 faq_autosearch_text']"));
		a5.sendKeys("//input[@class='col-xs-21 faq_autosearch_text']");
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
