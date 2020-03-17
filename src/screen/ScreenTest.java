package screen;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenTest {
	static WebDriver driver;
	private static void screen(String name) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File desc =new File("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\screen\\"+name);
		FileUtils.copyFile(src, desc);

	}
	
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	screen("first.png");
	
	WebElement e=driver.findElement(By.xpath("//input[@name='email']"));
	e.sendKeys("xyz2gmail.com");
	screen("second.png");
	
	WebElement e2=driver.findElement(By.xpath("//input[@type='password']"));
	e2.sendKeys("1234567");
	screen("three.png");
	
	WebElement e3=driver.findElement(By.xpath("//button[@type='submit']"));
	e3.click();
	screen("fourth.png");
	
	
		
		
		
		
	}
	
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

