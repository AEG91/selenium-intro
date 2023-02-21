import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPranctice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a= new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\\\Users\\\\eganu\\\\OneDrive\\\\Documents\\\\Anu-Career\\\\Selenium Screenshots\\\\sc3.png"));
		
		WebElement e=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(e).build().perform();
		WebElement text=driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("Anusree").doubleClick().build().perform();
		
	a.moveToElement(e).contextClick().build().perform();
	
	}

}
