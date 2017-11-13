package com.commlab.game;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FabFour {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
ChromeDriver driver = new ChromeDriver();
driver.get("https://cdn.commlabindia.com/origin/sample-courses/media/articulate-storyline/fabulous-four-02/story_html5.html");
driver.manage().window().maximize();
Thread.sleep(1000);

driver.findElement(By.xpath(".//*[@id='slide_6pEDHYQSQCF']/div[3]/input")).sendKeys("vijay");
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@class='item image vectorshape item_6BSobShDs94 textlib']/canvas")).click();
Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@class='item image vectorshape item_6DTYO3ociAR textlib']/canvas")).click();
		// TODO Auto-generated method stub

	}

}
