package excelfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Objectarray {
	public WebDriver driver;
	@BeforeMethod
	public void openpage()
	{
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		this.driver=driver;
		
	}
	
	@DataProvider(name="logindata")
	public Object[][] passdata()
	{
		Object[][] data= new Object[4][2];
		
		data[0][0]="tafajjul@gmail.com";
		data[0][1]="zilani";
		
		data[1][0]="tafajju@gmail.com";
		data[1][1]="zilan123i";
		
		data[2][0]="tafa1@gmail.com";
		data[2][1]="tafajjul";
		
		data[3][0]="tafajjulzilan@gmail.com";
		data[3][1]="zilani";
		return data;
	}
	
	@Test(dataProvider = "logindata")
	public void loginwebshop(String username,String password) {
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
		
	@AfterMethod
	public void exit()
	{
		driver.close();
	
	}

}
