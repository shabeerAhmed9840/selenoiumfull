package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumSample\\driver\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		w.get("http://www.greenstechnologys.com/index.html");
		
		//WebElement txtreview=w.findElement(By.xpath("//h2[text()=\"Greens Technologys Overall Reviews\"]"));
		
		//String text=txtreview.getText();
		//System.out.println(text);
		
		
		//Useing xpath
		WebElement txtPara=w.findElement(By.xpath("//div[@class='trainer-info'][2]"));
		String para=txtPara.getText();
		System.out.println(para);
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement txtuse=w.findElement(By.id("src"));
		//txtuse.sendKeys("chennai");
		
		//WebElement txtdes=w.findElement(By.id("dest"));
		//txtdes.sendKeys("Hyderabad");
		
		//WebElement txtdate=w.findElement(By.xpath("//label[@class='db text-trans-uc']"));
		//txtdate.sendKeys("01/12/2019");
		
		//WebElement btn=w.findElement(By.xpath("//button[@class='fl button']"));
		//btn.click();
		
	}

}
