package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion_print {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		Thread.sleep(3000);
	    List<WebElement>	suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	    System.out.println(suggestions.size());
	   // System.out.println(suggestions);
	    
	    //suggestions.get(3).click();
	    for(int i =0; i<suggestions.size();i++)
	    {
	    	String text=suggestions.get(i).getText();
	    	
	    	//Printing all the auto suggestions from search bar.
	    	System.out.println(text);
	    	

	}

}}
