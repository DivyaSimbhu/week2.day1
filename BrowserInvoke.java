package week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInvoke {
	
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		String url = "http://leaftaps.com/opentaps/";
		driver.get(url);
		driver.manage().window().maximize();
	}

}
