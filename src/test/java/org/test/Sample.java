package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\Task\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://gmail.com");
		Thread.sleep(2000);
	WebElement emil=d.findElement(By.id("identifierId"));
		emil.sendKeys("krishnaveni.donthula92@gmail.com");
	WebElement nxt=d.findElement(By.xpath("//span[text()='Next']"));
	nxt.click();
	Thread.sleep(4000);
WebElement pas=d.findElement(By.xpath("//input[@type='password']"));
pas.sendKeys("gmail123go");
WebElement clk=d.findElement(By.xpath("//span[text()='Next']"));
clk.click();
Thread.sleep(3000);
	d.close();
	



System.setProperty("webdriver.chrome.driver", "F:\\Work\\Task\\Driver\\chromedriver.exe");
WebDriver d1=new ChromeDriver();
d1.get("http://gmail.com");
Thread.sleep(2000);
WebElement emil1=d1.findElement(By.id("identifierId"));
emil1.sendKeys("krishnaveni.donthula92@gmail.com");
WebElement nxt1=d1.findElement(By.xpath("//span[text()='Next']"));
nxt1.click();
Thread.sleep(4000);
WebElement pas1=d1.findElement(By.xpath("//input[@type='password']"));
pas1.sendKeys("indiaongole");
WebElement clk1=d1.findElement(By.xpath("//span[text()='Next']"));
clk1.click();
Thread.sleep(2000);
d1.close();



System.setProperty("webdriver.chrome.driver", "F:\\Work\\Task\\Driver\\chromedriver.exe");
WebDriver d2=new ChromeDriver();
d2.get("http://gmail.com");
Thread.sleep(2000);
WebElement emil2=d2.findElement(By.id("identifierId"));
emil2.sendKeys("krishnaanil@gmail.com");
WebElement nxt2=d2.findElement(By.xpath("//span[text()='Next']"));
nxt2.click();
Thread.sleep(3000);
WebElement pas2=d2.findElement(By.xpath("//input[@type='password']"));
pas2.sendKeys("indiaongole");
Thread.sleep(2000);
WebElement clk2=d2.findElement(By.xpath("//span[text()='Next']"));
clk2.click();
Thread.sleep(2000);
d2.close();




System.setProperty("webdriver.chrome.driver", "F:\\Work\\Task\\Driver\\chromedriver.exe");
WebDriver d3=new ChromeDriver();
d3.get("http://gmail.com");
Thread.sleep(2000);
WebElement emil3=d3.findElement(By.id("identifierId"));
emil3.sendKeys("krishnaanil@gmail.com");
WebElement nxt3=d3.findElement(By.xpath("//span[text()='Next']"));
nxt3.click();
Thread.sleep(3000);
WebElement pas3=d3.findElement(By.xpath("//input[@type='password']"));
pas3.sendKeys("wrongpass");
Thread.sleep(2000);
WebElement clk3=d3.findElement(By.xpath("//span[text()='Next']"));
clk3.click();
Thread.sleep(2000);
d3.close();

	}
}

