package ExceptionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Karth\\Downloads\\Driver\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.co.in");
		
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Star"+Keys.ENTER);
		WebElement searchBox1=driver.findElement(By.name("q"));
		searchBox1.clear();
		
	}

}
