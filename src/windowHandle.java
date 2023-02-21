import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		String[] item=driver.findElement(By.xpath("//div[@class='col-md-8']/p[2]")).getText().split("@");
		String s=item[1].trim().split(" ")[0];
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s);
		

	}

}
