package webhand;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Base;

public class WebHandDemo extends Base{
static WebDriver driver;
public static void screen(String name) throws IOException {
	TakesScreenshot tk=(TakesScreenshot)driver;
     File src=tk.getScreenshotAs(OutputType.FILE);
     System.out.println(src);
     File dec=new File("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\screen\\"+name);
     FileUtils.copyFile(src, dec);
     }

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		//screen("flip1.png");
		WebElement close=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		//screen("flip2.png");
		WebElement ser=driver.findElement(By.xpath("//input[@type='text']"));
		ser.sendKeys("iphoneX",Keys.ENTER);
		Thread.sleep(5000);
		//screen("flip3.png");
		WebElement iphone=driver.findElement(By.xpath("//div[text()='Apple iPhone X (Silver, 64 GB)']"));
		iphone.click();
		//screen("flip4.png");
		
	    windowHandel(driver);
				
		WebElement add=driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));	
	add.click();
	    //screen("flip5.png");
		
				
				
			}
		
		
		
		
		
				
				
		
		
		
		
		
		
		
		
		
		
		
	}


