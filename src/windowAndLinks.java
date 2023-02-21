import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowAndLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement e= driver.findElement(By.id("gf-BIG"));
		WebElement s=e.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		List<WebElement> links=s.findElements(By.tagName("a"));
		int size=links.size();
		System.out.println("Number of links here is ---"+size);
		String Controlkey=Keys.chord(Keys.CONTROL,Keys.ENTER);
		for(int i=1;i<size;i++)
		{
			links.get(i).sendKeys(Controlkey);
			
		}
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			String title=driver.getTitle();
			System.out.println(title);
		}
		
	}

}
