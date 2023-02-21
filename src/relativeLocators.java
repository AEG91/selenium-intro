import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Object;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement email=driver.findElement(By.cssSelector("[name='email']"));
		driver.findElement(with(By.tagName("input")).above(email)).sendKeys("Anusree");
		//WebElement pwd=driver.findElement(By.id("exampleInputPassword1"));
		//driver.findElement(with(By.tagName("input")).below(pwd)).click();
		WebElement dob=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		WebElement ice=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(ice)).click();
		
	}
	
}
