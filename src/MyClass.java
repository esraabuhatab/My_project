import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");
		
		List<WebElement> myStudents = driver.findElements(By.tagName("option"));
		
		for (int i = 3; i < myStudents.size(); i=i+4) {
			
				myStudents.get(i).click();
				driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
				
		
		
	}
	}
}

		
