package multiplehandel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multihandel2 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		WebElement home=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		home.sendKeys("RedmiNote7",Keys.ENTER);
		Thread.sleep(2000);
		WebElement iphone=driver.findElement(By.xpath("//p[text()='Redmi Note 7 Pro ( 128GB , 6 GB ) Black']"));
		iphone.click();
		String par=driver.getWindowHandle();
		System.out.println(par);
		Set<String> child1=driver.getWindowHandles();
		System.out.println(child1);
		
		for(String child2:child1) {
			if(!par.equals(child2))
			
		driver.switchTo().window(child2);
		}
		WebElement tc=driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/offers/pnb-tnc']"));
		tc.click();
		Set<String> si = driver.getWindowHandles();
		List<String> li = new ArrayList<>();
		li.addAll(si);
		driver.switchTo().window(li.get(2));
		System.out.println(driver.getWindowHandle());

		WebElement tru=driver.findElement(By.xpath("//li[contains(text(),'If')]"));
		System.out.println(tru.getText());	
		driver.switchTo().window(par);
		System.out.println(driver.getWindowHandle());

		
		
		
		
		
		
		
		
		
		
	}

}
