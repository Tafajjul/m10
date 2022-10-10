package Pop_up;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
		TakesScreenshot ts=(TakesScreenshot)driver;  //Taking screenshot
		File src=ts.getScreenshotAs(OutputType.FILE);  //Calling the method to create the image file.
		
		Date dat= new Date(); //Making the object of date class present in selenium. 
		System.out.println(dat);
		String dates=dat.toString().replace(":", "."); //calling tosring() to replace the old character to new so that it doesnot overwrite .png file. 
		
		File dest=new File("./screenshot/" +dates+ ".png"); // the path of screenshot file.
		
		FileUtils.copyFile(src, dest); //coping the image file
		
	}

}
