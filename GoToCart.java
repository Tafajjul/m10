package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToCart {
	
	@FindBy(xpath = "//span[.='Shopping cart']")
	private WebElement cart;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement upadecart;
	
	@FindBy(xpath = "//input[@name='continueshopping']")
	private WebElement continuesopping;
	
	@FindBy(xpath = "//input[@name='termsofservice']")
	private WebElement accepttermAndcondition;
	
	@FindBy(id = "checkout")
	private WebElement checkoutbutton;
	
	
	public GoToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void gotoCartCheckOut() 
{
	
cart.click();
accepttermAndcondition.click();
checkoutbutton.click();

}

}
