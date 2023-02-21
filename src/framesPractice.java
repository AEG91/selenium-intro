import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		int size=driver.findElements(By.tagName("iframe")).size();
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
	
		System.out.println(size);
		WebElement e= driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(e);
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\Users\\eganu\\OneDrive\\Documents\\Anu-Career\\Selenium Screenshots\\sc2.png"));
		
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		driver.quit();

	}

}
