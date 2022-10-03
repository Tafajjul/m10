package Pop_up;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleBrowsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		
		
		//Getting alpha-numeric string values of all the browsers irrespective of  where the control of selenium is present. 
		Set<String> window=driver.getWindowHandles();

		//Storing all the alpha-numeric string values in arraylist.
		ArrayList<String> al= new ArrayList<>(window);
		
		for(int i=0;i<al.size();i++)
		{
			
			//switching from parent window to child window.
			driver.switchTo().window(al.get(i));
			String title=driver.getTitle();
			if(title.contains("Time Tracking"))
			{
				driver.switchTo().window(al.get(i));
				System.out.println(title);
			
			}
		
		}
		
	}

}
