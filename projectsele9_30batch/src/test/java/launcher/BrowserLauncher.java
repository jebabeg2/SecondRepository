package launcher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLauncher
{
	public static void main(String[] args)
	{
	     WebDriver driver;
	     
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/feed/");
		
		//WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.get("https://www.zomato.com/");
	}
}


