package ExceptionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NoSuchSessionExceptionExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Karth\\Downloads\\Driver\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.co.in");

	}

}
