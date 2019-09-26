package selprjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\LAX\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	
	
	
}
}
