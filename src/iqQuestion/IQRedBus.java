package iqQuestion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import baseclass.Base;

public class IQRedBus extends Base {
	public static void main(String[] args) throws AWTException {
		launch("https://www.redbus.in/");
		driver.manage().window().maximize();

		WebElement txtFrom = driver.findElement(By.xpath("//input[@id='src']"));
		fill(txtFrom, "chennai");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER );
		r.keyRelease(KeyEvent.VK_ENTER );

		WebElement txtDes = driver.findElement(By.xpath("//input[@id='dest']"));
		fill(txtDes, "Bangalore");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER );
		r.keyRelease(KeyEvent.VK_ENTER );
		WebElement clickDate = driver.findElement(By.xpath("//label[@class='db text-trans-uc']"));
		click(clickDate);
		List<WebElement> lstTable = driver.findElements(By.tagName("table"));

		WebElement table = lstTable.get(0);
		List<WebElement> lstFrom = table.findElements(By.tagName("tr"));
		// for (int j = 0; j < lstFrom.size(); j++) {
		WebElement row = lstFrom.get(5);
		List<WebElement> lstData = row.findElements(By.tagName("td"));
		// for (int k = 0; k < lstData.size(); k++) {
		WebElement data = lstData.get(2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", data);
		WebElement clickEnd = driver.findElement(By.xpath("//label[@class='db text-trans-uc tal']"));
		click(clickEnd);
		WebElement lstEndTable = lstTable.get(1);
		List<WebElement> lstDes = lstEndTable.findElements(By.tagName("tr"));
		// for (int l = 0; l < lstDes.size(); l++) {
		WebElement row2 = lstDes.get(5);
		List<WebElement> lstEnddata = row2.findElements(By.tagName("td"));
		WebElement data2 = lstEnddata.get(5);
		js.executeScript("arguments[0].click()", data2);

		WebElement search = driver.findElement(By.xpath("//button[@id='search_btn']"));
		js.executeScript("arguments[0].click()", search);

		System.out.println("great");

	}
}
