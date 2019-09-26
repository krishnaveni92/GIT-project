package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\Maven1stFrames\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.greenstechnologys.com");
		JavascriptExecutor js=(JavascriptExecutor)d;
		WebElement down=d.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
}
}
