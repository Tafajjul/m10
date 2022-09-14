package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_assign {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	// class name
	//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("tafajjul");
	
	// id locator
	driver.findElement(By.id("email")).sendKeys("tafa");

	// xpath
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tafajjul");
	
	//link text
	driver.findElement(By.linkText("Forgotten password?")).click();
	
		}
		
		// TODO Auto-generated method stub

	}


