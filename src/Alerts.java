import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[name='enter-name']")).sendKeys("Anusree");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\eganu\\OneDrive\\Documents\\Anu-Career\\Selenium Screenshots\\sc3.png"));
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		String p=driver.switchTo().alert().getText();
		System.out.println(p);
		driver.switchTo().alert().dismiss();
		

	}

}
