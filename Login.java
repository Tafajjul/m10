package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath = "//input[@name='Email']")
	private WebElement enteremail;
	
	@FindBy(xpath = "//input[@name='Password']")
	private WebElement enterpassword;
	
	@FindBy(xpath = "//input[@id='RememberMe']")
	private WebElement rememberme;
	
	@FindBy(linkText = "Forgot password?")
	private WebElement forgetpasswordlink;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement loginbutton;
	
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginmethod()
	{
		enteremail.sendKeys("tafa1@gmail.com");
		enterpassword.sendKeys("tafajjul");
		rememberme.click();
		loginbutton.click();
		
	}
	
	public void forgetpasswordmethod() {
		forgetpasswordlink.click();
	}

}
