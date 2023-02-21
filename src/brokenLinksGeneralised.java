import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class brokenLinksGeneralised {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li.gf-li a"));
		 for(WebElement link :links)
		 {
			 String url=link.getAttribute("href");
			 URL u=new URL(url);
			 HttpURLConnection connect=(HttpURLConnection)u.openConnection();
			 connect.setRequestMethod("HEAD");
			 connect.connect();
			 int n=connect.getResponseCode();
			 System.out.println(n);
			 
		 }
	}

}
