import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class streamPracticeSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\eganu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/cart");
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[2]/p"));
		System.out.println(veggies.size());
		veggies.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		List<String> vegetables=veggies.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedVegetables=vegetables.stream().sorted().collect(Collectors.toList());
		vegetables.stream().sorted().forEach(s->System.out.println(s));
		Assert.assertTrue(vegetables.equals(sortedVegetables));
		
		
		
		List<String> Price=veggies.stream().filter(s->s.getText().contains("BeetRoot")).map(s->getPrice(s)).collect(Collectors.toList());
		
	
	}
	public static String getPrice(WebElement s)
	{
		s.findElement(By.xpath("//tbody/tr/td[2]/following-sibling::td[2]"));
		return null;
	}

}
