import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Spicejetdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		

		//List<WebElement> s=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		/*for(WebElement element:s)
		{
			String n =element.getText();
			if(n.equalsIgnoreCase("india"))
			{
				element.click();
			}
		}*/
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_originStation1']")).click();
		//driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_originStation1'] //option[@value='BKK']")).click();
		//driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_destinationStation1']")).click();
		//driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_destinationStation1'] //option[@value='HYD']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		
		//driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		String f=driver.findElement(By.name("ctl00$mainContent$view_date2")).getAttribute("id");
		System.out.println(f);
		//driver.close();
		for (int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		
		int n=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(n);

		

	}

}
