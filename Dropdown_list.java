package practice;

import java.util.List;

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
    
    //Printing all the values in the drop-down list
    System.out.println(listbox.getText());
    
    List<WebElement> options= sel.getOptions();
    System.out.println(options.size());
    
    for(int i=0;i<options.size();i++)
    {
    	String s=options.get(i).getText();
    	
    	//checking specified item is present or not.
    	if(s.equalsIgnoreCase("Swiss Franc")) {
    		System.out.println("Specified item is present as "+s );
    	}
    
    
    }
   
	}

}
