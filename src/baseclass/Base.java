package baseclass;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Base {
	public static WebDriver driver;
	public static Actions a;
	public static Alert a2;
	public static void launch(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		ChromeOptions add=op.addArguments("--disable-notifications");
		driver= new ChromeDriver(add);
		driver.get(url);}
	public static void fill(WebElement e,String s) {
		e.sendKeys(s);}
	public static void click(WebElement e) {
		e.click(); }
	public static  void  gettext(WebElement e) {
		 e.getText(); }
	public static void rightClick(WebElement e) {
		 a=new Actions(driver);
		  a.contextClick(e).perform();
	    }
		public static void doubleClick(WebElement e) {
			 a=new Actions(driver);
	        a.doubleClick(e).perform();;
	    }
		public static void movetoElement(WebElement e) {
			 a=new Actions(driver);
	         a.moveToElement(e).perform();;
	   }
		public static void drag(WebElement src,WebElement des) {
			 a=new Actions(driver);
			 a.dragAndDrop(src, des).perform();
	  }
		public static void accept() {
			a2=driver.switchTo().alert();
			a2.accept();
	  }
		public static void dismiss() {
			a2=driver.switchTo().alert();
			a2.dismiss();
	  }
		public static void prompt(String input) {
			a2=driver.switchTo().alert();
			a2.sendKeys(input);
			a2.accept();
	  }
		public static void screenShot(String name) throws IOException {
			TakesScreenshot shot=(TakesScreenshot)driver;
			File src=shot.getScreenshotAs(OutputType.FILE);
			System.out.println(src);
	File desc=new File("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\screen\\"+name);
	FileUtils.copyFile(src, desc);
		}
		
		public static void windowHandel(WebDriver driver) {
			String par=driver.getWindowHandle();
			System.out.println(par);
			
			Set<String>child=driver.getWindowHandles();
			System.out.println(child);
			
			for(String child2:child) {
				if(!par.equals(child2)) {
					driver.switchTo().window(child2);
			}}}
		public static void impliWait(int i) {
			driver.manage().timeouts().implicitlyWait(i, TimeUnit.MILLISECONDS);
           }
		

}
