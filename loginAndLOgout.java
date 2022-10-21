package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import pom.AddtoCart;
import pom.Demowebshop_homepage;
import pom.GoToCart;
import pom.Login;
import pom.featuredProduct;
import pom.logout;

public class loginAndLOgout {
	
	@Test
	public void loginlogoutmethod() 
	{
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Demowebshop_homepage page=new Demowebshop_homepage(driver);
		page.loginmethod();
		
		Login in=new Login(driver);
		in.loginmethod();
		
		featuredProduct fea=new featuredProduct(driver);
		fea.giftcardselect();
		fea.computer();
		
		AddtoCart add=new AddtoCart(driver);
		add.addtocardmethod();
		
		GoToCart cart=new GoToCart(driver);
		cart.gotoCartCheckOut();
		
		logout out=new logout(driver);
		out.logoutmethod();
	}

}
