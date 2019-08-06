package com.ScreenshotHandle;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenShot {

     static WebDriver driver;
	@Test
	public void TakeScreenshot() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
		Screenshot("Home Page");
	}
	@Test
	public void Screenshot(String newFile) throws IOException
	{
	File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(file,new File("D:\\New Testing\\Screenshot\\src\\com\\ScreenshotHandle\\" +newFile+".png"));
	}
}
