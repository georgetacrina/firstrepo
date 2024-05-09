package introduction2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sellintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // "/Users/Crina.Rogojan/downloads/chromedriver_mac64"
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/Crina.Rogojan/downloads/chromedriver_mac64");
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
	}

}
