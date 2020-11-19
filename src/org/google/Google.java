package org.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jebin Arockia A\\Eclipse-works space jebin\\WebDriver\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("GreensTechnology");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
	}

}
