package ExceptionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidElementStateExceptionExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Karth\\Documents\\Naveen Kumar S\\Driver\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("C:\\Users\\Karth\\Documents\\Naveen Kumar S\\LAO\\HiddenField.html");
		
		WebElement textBox=driver.findElement(By.id("textID"));
		//textBox.clear();  //ElementNotVisibleException or EleementnotInteractableException
		textBox.sendKeys(""); //InvalidElementStateException
	}

}
