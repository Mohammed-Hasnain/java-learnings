package SeleniumPractice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScrollPractice {

	public static void main(String[] args) throws InterruptedException, Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\mohammed.hasnain\\Documents\\Hasnain\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.airasia.co.in/home");
		Thread.sleep(2000);
		JavascriptExecutor je =(JavascriptExecutor)driver;
		je.executeScript("scroll(0,400)");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\Users\\mohammed.hasnain\\eclipse-workspace\\JavaSessions\\src\\sceenShots\\airAsia.png"));
	}

}
