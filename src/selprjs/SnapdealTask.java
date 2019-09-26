package selprjs;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealTask {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selprjs\\driver\\chromedriver.exe");
	WebDriver dev= new ChromeDriver();
	dev.get("https://www.snapdeal.com/");
	dev.manage().window().maximize();
	WebElement unam = dev.findElement(By.id("inputValEnter"));
	unam.sendKeys("Samsung UA55RU7100K 138 cm");
	WebElement search = dev.findElement(By.xpath("//span[text()='Search']")); 
	search.click();
	WebElement d = dev.findElement(By.xpath("//img[@title='Samsung UA55RU7100K 138 cm ( 55 ) Ultra HD (4K) LED Television']"));
	d.click();
	String pwind = dev.getWindowHandle();	
	System.out.println(pwind);
	Set<String> allwind = dev.getWindowHandles();
	for (String v : allwind) {
		System.out.println(v);
		if (!(pwind.equals(v))) {
				dev.switchTo().window(v);
			}}
	dev.findElement(By.xpath("//span[text()='buy now']")).click();
	Thread.sleep(6000);
	TakesScreenshot z=(TakesScreenshot)dev;
	File src=z.getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	File dest=new File("C:\\Users\\ELCOT\\Desktop\\Screeenshot\\SDshot.jpeg");
	FileUtils.copyFile(src, dest);
	}
}
