package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//to find the last two rows of dynmaic webtable
public class Tabel2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		for (int i = row.size()-2; i < row.size(); i++) {
			System.out.println(i);
			WebElement w = row.get(i);
			List<WebElement> data = w.findElements(By.tagName("td"));
			for (int j = 0; j < data.size(); j++) {
				WebElement d = data.get(j);
				String text = d.getText();
				
			System.out.println(text);}
			
			driver.quit();
		}}}
			
			
		
			
		


