package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\Work\\Maven1stFrames\\Driver\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://demo.automationtesting.in/Alerts.html");
	WebElement btngo=d.findElement(By.xpath("//button[contains(text(),'    click the button to display an  alert box:')]"));
btngo.click();
	Alert a1=d.switchTo().alert();
a1.accept();
Thread.sleep(2000);
WebElement second=d.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
second.click();
WebElement btn2=d.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
btn2.click();
a1.dismiss();
WebElement third=d.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
third.click();
WebElement btn3=d.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));
btn3.click();
a1.sendKeys("krishna");
a1.accept();
}
}
