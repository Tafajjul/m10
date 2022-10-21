package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class featuredProduct {
	
	@FindBy(xpath = "//img[@title='Show details for $25 Virtual Gift Card']")
	private WebElement giftcard;
	
	@FindBy(xpath = "//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000224_141-inch-laptop_125.png']")
	private WebElement laptop;
	
	@FindBy(xpath = "//img[@title='Show details for Build your own cheap computer']")
	private WebElement buildYourOwnComputer;
	
	public featuredProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void giftcardselect() {
		giftcard.click();
	}
	public void computer()
	{
		laptop.click();
	}
	

}
