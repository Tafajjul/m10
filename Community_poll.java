package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Community_poll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("tafajjulzilani@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tafajjul878");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		
		  driver.findElement(By.xpath("//input[@id='pollanswers-2']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		 
	}

}
