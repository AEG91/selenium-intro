import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("eg.anusree@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcdsgh");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.linkText("Forgot password?")).click();
		//String x=driver.findElement(By.cssSelector("div._9ay7")).getText();
		//System.out.println(x);
		String y=driver.findElement(By.className("_9ay7")).getText();
		System.out.println(y);
		

	}

}
