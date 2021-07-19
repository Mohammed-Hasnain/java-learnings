package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\mohammed.hasnain\\Documents\\Hasnain\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sites.google.com/site/httpwwwseleniumhqorg/download");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.close();
	}

}
