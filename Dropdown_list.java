package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_list {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/tools/forex");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement listbox	=driver.findElement(By.xpath("//select[@name='cnfrm']"));
	
	Select sel= new Select(listbox);
	//sel.selectByVisibleText("UAE Dirham");
	//sel.selectByValue("82.71");
    sel.selectByIndex(10);
  System.out.println(listbox.getText());
		
	}

}
