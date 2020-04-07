import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/aeologic/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://dev.thespicetag.com/login");
		driver.get("http://qa.thespicetag.com/login");
		
		WebElement userid = driver.findElement(By.xpath("//input[@placeholder=\"User ID\"]"));
		WebElement password= driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		userid.sendKeys("yash@aeologic.com");
		password.sendKeys("password");
		button.click();
		
		
		
		
		

	}

}
