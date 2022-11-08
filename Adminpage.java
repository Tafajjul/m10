package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Adminpage {
	


	@FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
	private WebElement adminlink;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employname;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchbutton;
	
	Robot r ;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement statusdropdown;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employensmetextfield;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement usernsmetextfield;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirmpwdtextfield;
	
	
	public Adminpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addusermethod() throws AWTException, InterruptedException {
		adminlink.click();
		employname.sendKeys("Tafajjul Zilani");
		searchbutton.click();
		
		
	}
	
	
}
