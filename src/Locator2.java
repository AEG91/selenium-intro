import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String pass=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("eg.anusree@gmail.com");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(pass);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		String a=driver.findElement(By.xpath("//div[@class='login-container']")).getText();
		System.out.println(a);
		Thread.sleep(1000);
		String tagname=driver.findElement(By.tagName("p")).getText();
		System.out.println(tagname);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();

	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String p=driver.findElement(By.cssSelector("form p")).getText();
		String[] p1= p.split("'");
		String password=p1[1].split("'")[0];
		return password;
		
		
		
		
	}

}
