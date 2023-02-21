import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class LocatorsRahulshettypage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Anusree");
		driver.findElement(By.name("inputPassword")).sendKeys("anusree");
		driver.findElement(By.cssSelector(".submit")).click();
		String s=driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(s);

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("eg.anusree@gamil.com");
		driver.findElement(By.xpath("//input[@type='text'][1]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("Anu");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("eg.anu@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("4807969917");
		driver.findElement(By.xpath("//form/input[3]"));
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String p=driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(p);
		driver.findElement(By.xpath("//div/button[contains(@class,'login')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("eg.anusree@gmail.com");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		String a=driver.findElement(By.xpath("//div[@class='login-container']")).getText();
		System.out.println(a);
		Thread.sleep(1000);
		String tagname=driver.findElement(By.tagName("p")).getText();
		System.out.println(tagname);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		
		

	
		
			

	}
}
	
