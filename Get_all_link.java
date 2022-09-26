package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_all_link {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//by using augtosuggestion
			/*
			 * driver.get("https://www.google.com");
			 * driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(
			 * "facebook"); Thread.sleep(3000);
			 * 
			 * List<WebElement>
			 * link=driver.findElements(By.xpath("//span[contains(text(),'facebook')]"));
			 * System.out.println(link.size());
			 * 
			 * for(int i=0;i<link.size();i++) {
			 * 
			 * String fb=link.get(i).getText(); if(fb.equalsIgnoreCase("Facebook")) {
			 * link.get(i).click(); driver.findElement(By.xpath(
			 * "//a[@data-ved='2ahUKEwiwn9i6mKr6AhUCq1YBHW2jAk4Q0Qx6BAgEEAE']")).click();
			 * break; } }
			 */
			//driver.findElement(By.xpath("//a[@data-ved='2ahUKEwiwn9i6mKr6AhUCq1YBHW2jAk4Q0Qx6BAgEEAE']")).click();
			//driver.findElement(By.linkText("Facebook.com - Facebook® - Account Sign Up")).click();
			driver.get("https://www.facebook.com/login.php");
			List<WebElement> link=driver.findElements(By.xpath("//a"));
			System.out.println(link.size());
			for(int i=0;i<link.size();i++) {
				String print=link.get(i).getText();
				System.out.println(print);
			}
			}
	}

