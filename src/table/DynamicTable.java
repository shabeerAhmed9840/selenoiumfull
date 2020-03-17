package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//to find the middle value from a dynmaic text
public class DynamicTable {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> r = driver.findElements(By.tagName("tr"));
	
		int x;
	     if (r.size()%2==0) {
	    	x= r.size()/2;}
	    	else {
	    		x=(r.size()/2)+1;
	    		}
	     List<WebElement> d = r.get(x).findElements(By.tagName("td"));
	     int y;
	     if (d.size()%2==0) {
	    	 y=d.size()/2;}
	     else {
	    	 y=(d.size()/2)+1;
	    	 }
	     String text = d.get(y).getText();
	     int x1 = Integer.parseInt(text);
	     System.out.println(text);
	     driver.quit();
	 }

}
