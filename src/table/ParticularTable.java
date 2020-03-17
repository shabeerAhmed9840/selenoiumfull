package table;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import baseclass.Base;
import net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool;

public class ParticularTable extends Base{
public static void main(String[] args) {
	launch("http://toolsqa.com/automation-practice-table/");
	List<WebElement> table = driver.findElements(By.tagName("table"));
	driver.manage().window().maximize();
	List<WebElement> row = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < row.size(); i++) {
WebElement w = row.get(i);
String x = w.getText();

    List<WebElement> data = w.findElements(By.tagName("td"));
    for (int j = 0; j < data.size(); j++) {
    	WebElement w1 = data.get(j);
    	String t2 = w1.getText();
    	if (t2.equals("Dubai")) {
    		System.out.println(t2);
    		System.out.println("row number"+i);
    		System.out.println("colume number"+j);
			
		}
    	Options manage = driver.manage();
    	Timeouts timeouts = driver.manage().timeouts();
    	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    	FluentWait<WebDriver>f=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
    			.pollingEvery(Duration.ofMillis(100)).ignoring(Throwable.class);
    	f.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		
	}
		
		
	}
}

}
