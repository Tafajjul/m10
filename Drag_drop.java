package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source=driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement dest=driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, dest).perform();

	}

}
