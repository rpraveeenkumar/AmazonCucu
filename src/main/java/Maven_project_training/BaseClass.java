package com.Maven_project_training;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver launchbrowser () {
	
			System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		
		
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void closewindow() {
		driver.close();
	}
	
	public static void quitbrowser() {
		driver.quit();
	}
	public static void keytosend(WebElement element, String input) {
		element.sendKeys(input);
	}
	public static void clicktheElement(WebElement element) {
		element.click();
	}
	
	public static void mouseScroll() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void pageDown() throws AWTException {
		Robot rob=new Robot();
		for (int i = 0; i < 10; i++) {
			rob.keyPress(KeyEvent.VK_PAGE_DOWN);
			rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
	}
	
	public static WebDriver switchtab() {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!window.equals(windows)) {
				driver.switchTo().window(window);
			}
		}
		return driver;
	}
	
	public static WebDriver Snip(String location) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File pic=ts.getScreenshotAs(OutputType.FILE);
		File loc=new File(location);
		FileUtils.copyFile(pic, loc);
		return driver;
	}
}
