package ExceptionExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchFrameExceptionExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Karth\\Downloads\\Driver\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(5);

	}

}
