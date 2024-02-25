package ExceptionExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UnreachableBrowserExceptionExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.ie.driver", "C:\\Users\\Karth\\Downloads\\Driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.navigate().to("http://www.google.co.in");

	}

}
