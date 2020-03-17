package frames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement c1=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		c1.click();
		Thread.sleep(5000);
		Alert a=driver.switchTo().alert();
		a.accept();
		
		WebElement a2=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		a2.click();
		
		WebElement c2=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		c2.click();
		Thread.sleep(5000);
		a.dismiss();
		
		WebElement a3=driver.findElement(By.xpath("//a[@href='#Textbox']"));
		a3.click();
		
		WebElement c3=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		c3.click();
		Thread.sleep(5000);
		a.sendKeys("hellow world");
		a.accept();
		
		WebElement c4=driver.findElement(By.xpath("//p[@id='demo1']"));
		String  s = c4.getText();
		
		
		System.out.println("output:"+s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
