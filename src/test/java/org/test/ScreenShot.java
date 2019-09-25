package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "F:\\Work\\Maven1stFrames\\Driver\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("http://www.greenstechnologys.com");
TakesScreenshot tk=(TakesScreenshot)d;
File s=tk.getScreenshotAs(OutputType.FILE);
System.out.println(s);
File dest=new File("F:\\krishna\\fileoperation.png");
FileUtils.copyFile(s, dest);
}
}
