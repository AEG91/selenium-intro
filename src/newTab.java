import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/angularpractice/shop");
		String name=driver.findElement(By.xpath("//a[text()='iphone X']")).getText();
		driver.switchTo().window(parent);
		WebElement field=driver.findElement(By.cssSelector("[name='name']:nth-child(2)"));
		field.sendKeys(name);
		File src=((TakesScreenshot)field).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("newfiled.png"));
		int height=field.getRect().getDimension().getHeight();
		int width=field.getRect().getDimension().getWidth();
		System.out.println(height);
		System.out.println(width);
		

	}

}
