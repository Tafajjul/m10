package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	
	@FindBy(xpath = "(//input[@class=\"button-2 product-box-add-to-cart-button\"])[2]")
	private WebElement laptopaddcart;
	
	@FindBy(xpath = "(//input[@class=\"button-2 product-box-add-to-cart-button\"])[1]")
	private WebElement giftcardadd;
	

	@FindBy(xpath = "(//a[@href=\"/books\"])[1]")
	private WebElement booklink;
	
	@FindBy(xpath = "(//input[@class='button-2 product-box-add-to-cart-button'])[2]")
	private WebElement fictionbookadd;
	
	public AddtoCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addtocardmethod() {
		
		laptopaddcart.click();
		giftcardadd.click();
		booklink.click();
		fictionbookadd.click();
	}
	
	

}
