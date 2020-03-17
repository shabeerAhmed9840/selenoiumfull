package table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Base;

public class IQtable extends Base {
	public static void main(String[] args) {
		launch("https://www.calendarlabs.com/online-calendar/january-2020-calendar/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> tableNumber = driver.findElements(By.tagName("table"));
		WebElement table = tableNumber.get(1);

		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int j = 0; j < row.size(); j++) {
			WebElement rowNumber = row.get(j);

			        List<WebElement> data = rowNumber.findElements(By.tagName("td"));
                    for (int k = 0; k < data.size(); k++) {
				    WebElement listData = data.get(k);
				    String text = listData.getText();
				    if (text.equals("8")) {
					WebElement days = row.get(1);
					List<WebElement> dayList = days.findElements(By.tagName("td"));
					String day = dayList.get(k).getText();
					System.out.println(day);

				}
			}
		}
		WebElement top = row.get(0);
		List<WebElement> topClick = top.findElements(By.tagName("td"));
		WebElement nextMonth = topClick.get(2);
		click(nextMonth);
		
		}

	}

