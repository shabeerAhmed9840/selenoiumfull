package frames;

import java.util.List;

import javax.swing.Box.Filler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Base;

public class IciciFrame extends Base {
	public static void main(String[] args) throws InterruptedException {
     launch("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI\r\n"
				);
     
       List<WebElement> e1 = driver.findElements(By.tagName("iframe"));
    		   int i = e1.size();
       System.out.println(i);
     
     WebElement e = driver.findElement(By.xpath("//input[@class='login-input mode-select-userid']"));
     Actions a = new Actions(driver);
     a.moveToElement(e);
     a.click();
     a.sendKeys("12345678");
     a.perform();
		
		
		
		
		
		
		
		
		
	}
	

}
