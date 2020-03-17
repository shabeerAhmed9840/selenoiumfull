package dropanddownn;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

import baseclass.Base;


//drog and drop
public class Nov26 extends Base {
	
	public static void main(String[] args){
		launch("http://demo.guru99.com/test/drag_drop.html");
		
		        WebElement bank=driver.findElement(By.xpath("//li[@id='credit2']"));
		        WebElement drop=driver.findElement(By.xpath("//ol[@id='bank']"));
				drag(bank, drop);
				
				WebElement amount=driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
				WebElement dest=driver.findElement(By.xpath("//ol[@id='amt7']"));
				drag(amount, dest);
				
                WebElement sale=driver.findElement(By.xpath("//li[@class='block15 ui-draggable']"));
				WebElement drop1=driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
				drag(sale, drop1);
				
				WebElement amount2=driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
				WebElement dest2=driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));
				drag(amount2, dest2);
				
				WebElement per=driver.findElement(By.xpath("(//div[@id='equal'])[1]"));
				String txt=per.getText();
				
			     String s=("Perfect!");
			     
			    if(txt.equals(s)) {
			    	System.out.println("perfect is present");
			    }
			    else {
			    	System.out.println("perfect is not prsent");
			    }
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
				
				
				
		
		
		
		
		
		
		
	}

}
