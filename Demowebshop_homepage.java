package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demowebshop_homepage {
	
	@FindBy(linkText = "Register")
	private WebElement registerbutton;
	
	@FindBy(linkText = "Log in")
	private WebElement loginbutton;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement soppingcartbutton;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistbutton;
	
	public Demowebshop_homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void registerbuttonmethod()
	{
		registerbutton.click();
	}
	public void loginmethod()
	{
		loginbutton.click();
	}
	
	public void soppingcartmethod()
	{
		soppingcartbutton.click();
	}
	public void wishlistmethod() {
		wishlistbutton.click();
	}

	
	
}
