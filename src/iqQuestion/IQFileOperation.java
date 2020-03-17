package iqQuestion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IQFileOperation {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement textSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		textSearch.sendKeys("iphone", Keys.ENTER);
		List<WebElement> listOfIphone = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i = 0; i < listOfIphone.size(); i++) {
			String textOfIphone = listOfIphone.get(i).getText();
			// boolean createNewFile = loc.createNewFile();

			/*
			 * FileUtils.writeStringToFile(loc, textOfIphone);
			 */ System.out.println(textOfIphone);
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\SeleniumDemo\\file\\amazon.txt"));
			String[] split = new String[] {textOfIphone};
			for (String s : split) {
				bw.write(s);
				bw.newLine();

			}bw.close();

		}

		System.out.println("done");
		driver.quit();

	}

}
