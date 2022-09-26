package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rows_Cloumn_count {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://money.rediff.com/tools/forex");
		WebElement table = driver.findElement(By.className("dataTable"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> col= table.findElements(By.tagName("td"));
		
		//printing the numbers of rows and columns
		System.out.println(rows.size());
		System.out.println(col.size());
		
		//fetching all the data in a table by using for loop
		for(int i=0;i<rows.size();i++) {
			System.out.println(rows.get(i).getText());
			}
		
			/*
			 * for(int j=0;j<col.size();j++) { System.out.println(col.get(j).getText()); }
			 */
	}

}
