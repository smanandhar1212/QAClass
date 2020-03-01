import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleTest {

	public static void main(String[] args) {
		
		// Creating webDriver obj
		// setting system path
		System.setProperty("webdriver.chrome.driver","./libs/chromedriver");
		// Creating new chromedriver obj
		WebDriver driver = new ChromeDriver();
		//involving the web browser
		driver.get("http://www.google.com");
		//maximize the browser
		driver.manage().window().maximize();
		
		WebElement txtBoxSearch = driver.findElement(By.xpath("//input[@name='q']"));
		txtBoxSearch.sendKeys("What is Selenium");
	}
	

}
