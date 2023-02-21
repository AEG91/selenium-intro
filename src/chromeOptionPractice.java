import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;


public class chromeOptionPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated meth
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("start-maximized");
		//options.addArguments("incognito");
		//options.addArguments("headless");
		//options.setAcceptInsecureCerts(false);
		//options.addArguments("disable-popup-blocking");
		
		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\eganu\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		//driver.get("https://expired.badssl.com/");
		driver.get("https://www.makemytrip.com/");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("C:\\Users\\eganu\\OneDrive\\Documents\\Anu-Career\\Selenium Screenshots\\sc.png"));
		
		

	}

}
