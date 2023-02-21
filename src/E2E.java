import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {


public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//div[@role='combobox'] //input[@type='text']")).sendKeys("ben");
}
}