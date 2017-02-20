package com.acc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class startTest {

	private WebDriver driver;
	
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@AfterTest
	public void trminate(){
		
		driver.quit();
		
	}
	
	@Test
	public void StartTest(){
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='signup']/form/div[1]/div[1]/input")).sendKeys("purvesh");
		driver.findElement(By.xpath("//*[@id='signup']/form/div[1]/div[2]/input")).sendKeys("jaiswal");
		driver.findElement(By.xpath("//*[@id='signup']/form/div[2]/input")).sendKeys("jaiswal@india.com");
		driver.findElement(By.xpath("//*[@id='signup']/form/div[3]/input")).sendKeys("jaiswal");
		driver.findElement(By.xpath("//*[@id='signup']/form/button")).click();
	
	}
}
