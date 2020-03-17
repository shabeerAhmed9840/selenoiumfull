package screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenss {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
  JavascriptExecutor js=(JavascriptExecutor)driver;	
  WebElement down=driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
  js.executeScript("arguments[0].scrollIntoView(true)",down);
  
  TakesScreenshot tk=(TakesScreenshot)js;
  File src =tk.getScreenshotAs(OutputType.FILE);
  System.out.println(src);
  
  File des=new File("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\screen\\Scroll.png");
  FileUtils.copyFile(src, des);
  
		
		
		
		
		
		
		
		
		
		
		
	}

}
