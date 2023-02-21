import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathsibling {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.navigate().to("https:www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		String p=driver.findElement(By.xpath("//div/button[1]/following-sibling::button[2]")).getText();
		System.out.println(p);
		
	}

}
