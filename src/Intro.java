import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(url);
		driver.quit();
		
	}
}

		
