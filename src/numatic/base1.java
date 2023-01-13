package numatic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class base1 {
	
	static WebDriver driver;
	 
	public static void initilizebrowser () throws IOException
	{
		ChromeOptions options =new ChromeOptions();
	     options.addArguments("--disable-notifications");
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SAGAR\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");  
		 driver = new ChromeDriver();  
		 driver.get("https://jobs.numadic.com/jobs/Careers");
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
