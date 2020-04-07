import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/aeologic/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.thespicetag.com/login");
		

	}

}
