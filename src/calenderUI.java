import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.id("form-field-travel_from")).sendKeys("ABCD");
		w.until(ExpectedConditions.elementToBeClickable(By.id("form-field-travel_comp_date")));
		Thread.sleep(1000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();
	WebElement months=driver.findElement(By.cssSelector(".cur-month"));
		while(!months.getText().contains("March"))
		{
			driver.findElement(By.cssSelector(".flatpickr-next-month svg")).click();
		}
		List<WebElement> e=driver.findElements(By.xpath("//span[@class='flatpickr-day']"));
		
		for(int i=0;i<e.size();i++)
		{
			String text=e.get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				e.get(i).click();
			}
		}
	}

}
