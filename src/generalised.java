import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class generalised {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(3));
	 String[] items= {"Brocolli","Cucumber"};
	 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		addItemMethod(driver,items);
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("Anusree");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		String s= driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(s);
	}
		
	
	
	
	
	
	
	
	
	
	//driver.findElement(By.xpath("//input[@type='search']")).sendKeys("itesm");
		
		//List<WebElement> list=driver.findElements(By.cssSelector("h4.product-name"));
		public static void addItemMethod(WebDriver driver,String[] items)
		{
		List<WebElement> list=driver.findElements(By.cssSelector("h4.product-name"));
		int sise1=list.size();
		System.out.println(sise1);
		for (int i=0;i<list.size();i++)
		{
			String[] s=list.get(i).getText().split("-");
			String realTtem=s[0].trim();
			System.out.println(realTtem);
			List<String> allItems=Arrays.asList(items);
			int j=2;
			if(allItems.contains(realTtem))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//break;
				j++;
				if(j==2)
				{
					break;
				}
			}
		}
	
	

	}

}
