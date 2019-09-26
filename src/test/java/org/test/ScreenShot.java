package org.test;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\Work\\Maven1stFrames\\Driver\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.flipkart.com");
Thread.sleep(2000);
//WebElement wrng=d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
//wrng.click();
WebElement serch=d.findElement(By.xpath("//input[@type='text']"));
serch.sendKeys("iphone7");
Thread.sleep(2000);

WebElement btn=d.findElement(By.xpath("//button[@class='vh79eN']"));
btn.click();
Thread.sleep(2000);
WebElement selct=d.findElement(By.xpath("(//div[@class='_3SQWE6'])[1]"));
selct.click();
Thread.sleep(2000);
WebElement crt=d.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
crt.click();
}
}
/*TakesScreenshot tk=(TakesScreenshot)d;
File s=tk.getScreenshotAs(OutputType.FILE);
System.out.println(s);
File dest=new File("F:\\krishna\\fileoperation.png");
FileUtils.copyFile(s, dest);
}*/