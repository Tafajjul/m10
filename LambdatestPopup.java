package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdatestPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.lambdatest.com/selenium-playground/");
		
		driver.manage().window().maximize(); //maximizing the browser.
		
		driver.findElement(By.linkText("Javascript Alerts")).click(); //Clicking on the link of javascript alerts.
		
		driver.findElement(By.xpath("//button[@class='btn btn-dark my-30 mx-10 hover:bg-lambda-900 hover:border-lambda-900']")).click(); 
		//clicking on alertbox to pop-up alert.
		
		Alert alt=driver.switchTo().alert(); //switching to alert pop-up.
		
		alt.accept();  //Handling the pop-up by accepting it.
	}

}
