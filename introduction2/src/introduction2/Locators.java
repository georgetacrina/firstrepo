package introduction2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // "/Users/Crina.Rogojan/downloads/chromedriver_mac64"
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.setProperty("webdriver.chrome.driver", "/Users/Crina.Rogojan/downloads/chromedriver_mac64");
		driver.get("http://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("lalaLand");
		driver.findElement(By.name("inputPassword")).sendKeys("efdfdf");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
	}
}
