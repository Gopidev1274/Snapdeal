package selprjs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableTask {
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\selprjs\\driver\\chromedriver.exe");
		WebDriver dev= new ChromeDriver();
		dev.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tRows = dev.findElements(By.tagName("tr"));
	for (int i = 0; i < tRows.size(); i++) {
		WebElement tRow = tRows.get(1);
	List<WebElement> tDatas = tRow.findElements(By.tagName("td"));
	for (int j = 0; j < tDatas.size(); j++) {
		WebElement tData = tDatas.get(2);
		String text = tData.getText();
		System.out.println(text);
	}}}}
