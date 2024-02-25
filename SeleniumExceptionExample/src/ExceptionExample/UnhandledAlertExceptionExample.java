package ExceptionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlertExceptionExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Karth\\Downloads\\Driver\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://letcode.in/alert");
		
		WebElement alert=driver.findElement(By.id("accept"));
		alert.click();
		
		WebElement getLabel=driver.findElement(By.id("confirm"));
		
	}

}
