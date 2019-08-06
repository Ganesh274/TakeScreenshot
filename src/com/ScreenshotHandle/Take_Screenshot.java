package com.ScreenshotHandle;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Take_Screenshot {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		takeScreenshot("Login_Page");
		
		
	}
	
	
	public static void takeScreenshot(String fileName) throws IOException
	{
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("D:\\New Testing\\Screenshot\\src\\"+fileName+".png"));
	}	

}
