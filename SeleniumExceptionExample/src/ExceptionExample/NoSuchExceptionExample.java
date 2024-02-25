package ExceptionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchExceptionExample {
	public static void main(String[]args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Karth\\Downloads\\Driver\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.co.in");
		
		WebElement searchBox=driver.findElement(By.name("qb"));//error No such element ->correct "q"
		searchBox.sendKeys("Star"+Keys.ENTER);
	}
}
