package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	
	@FindBy(linkText = "Log out")
	private WebElement logoutbutton;
	
	public logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	public void logoutmethod()
	{
		logoutbutton.click();
	}
}
