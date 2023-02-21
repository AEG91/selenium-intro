import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String url=driver.findElement(By.xpath("//a[contains(@href,'brokenlink')]")).getAttribute("href");
		HttpURLConnection u=(HttpURLConnection) new URL(url).openConnection();
		u.setRequestMethod("HEAD");
		u.connect();
		int n=u.getResponseCode();
		System.out.println(n);
		
		/*List <WebElement> links=driver.findElements(By.tagName("a"));
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext())
		{
			String url=it.next().getAttribute("href");
			HttpURLConnection c= (HttpURLConnection)new URL(url).openConnection();
			c.setRequestMethod("HEAD");
			c.connect();
			int n=c.getResponseCode();
			System.out.println(c);
		}*/
		
	}

}
;