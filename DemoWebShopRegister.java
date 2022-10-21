package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import pom.Demowebshop_homepage;
import pom.RegisterAccount;

public class DemoWebShopRegister {
	
	@Test
	public void register() 
	{
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Demowebshop_homepage home=new Demowebshop_homepage(driver);
		home.registerbuttonmethod();
		
		RegisterAccount account=new RegisterAccount(driver);
		account.accountRegistermethod();
		
	}

}
