package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		//getting all value of row in trows
		List<WebElement> trows=driver.findElements(By.tagName("tr"));
		//selecting index of the row which need to print 
		WebElement trows1=trows.get(5);
		
		//getting all data in data veritable 
		List <WebElement>data=trows1.findElements(By.tagName("td"));
		//Selecting value in index which need to print 
	    WebElement tData=data.get(4);
			
	
		String rank2 =tData.getText();
		System.out.println("china has got rank"+rank2+"for tallest building");
		
					
			
		}}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


