package selprjs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selprjs\\driver\\chromedriver.exe");
	WebDriver dev=new ChromeDriver();
	dev.get("https://www.trip.com");
	dev.findElements(By.id("searchBtn"))
}
}
