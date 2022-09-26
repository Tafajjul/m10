package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencart_register {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("My Account")).click();
		driver.findElement(By.xpath("//a[@aria-expanded='false']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Tafajjul");
		driver.findElement(By.id("input-lastname")).sendKeys("Zilani");
		driver.findElement(By.id("input-email")).sendKeys("tafazilani@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Tafajjul878");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//a[contains(@aria-expanded,'false')]
	}

}
