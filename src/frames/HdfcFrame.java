package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import baseclass.Base;

public class HdfcFrame extends Base{
	public static void main(String[] args) {
		launch("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement f = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(f);
		System.out.println("switched to frame");
		WebElement e = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		fill(e, "123456");
		WebElement c = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
		click(c);
        
		WebElement f2 = driver.findElement(By.xpath("//frame[@src='RSLogin.html?v=12']"));
		driver.switchTo().frame(f2);
		WebElement p = driver.findElement(By.xpath("(//input[@class='input_password'])[2]"));
		fill(p, "cool");
		WebElement l = driver.findElement(By.xpath("//img[@src='/gif/login_new1.gif']"));
		click(l);
		WebElement t = driver.findElement(By.xpath("//strong[contains(text(),'The Customer')]"));
		gettext(t);
		
		
		
	}

}
