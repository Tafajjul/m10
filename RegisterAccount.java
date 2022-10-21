package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccount {
	
	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement maleRadioButton;
	
	@FindBy(xpath = "//input[@id='gender-female']")
	private WebElement femaleRadioutton;
	
	@FindBy(xpath = "//input[@name='FirstName']")
	private WebElement enterfirstName;
    
	@FindBy(xpath = "//input[@name='LastName']")
	private WebElement enterlastname;
	
	@FindBy(xpath = "//input[@name='Email']")
	 private WebElement enterEmail;
	
	@FindBy(xpath = "//input[@name='Password']")
	private WebElement enterPassword;
	
	@FindBy(xpath = "//input[@name='ConfirmPassword']")
	private WebElement enterConfirmpassword;
	
	@FindBy(xpath = "//input[@name='register-button']")
	private WebElement registerbutton;
	
	public RegisterAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void accountRegistermethod() {
		maleRadioButton.click();
		enterfirstName.sendKeys("tafajjul");
		enterlastname.sendKeys("zilani");
		enterEmail.sendKeys("tafaj1@gmail.com");
		enterPassword.sendKeys("tafajjul");
		enterConfirmpassword.sendKeys("tafajjul");
		registerbutton.click();
	}
}
