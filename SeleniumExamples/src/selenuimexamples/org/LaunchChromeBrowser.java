package selenuimexamples.org;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		// To launch chrome browser
		WebDriver driver = new ChromeDriver();
		//Maximize chrome window
		driver.manage().window().maximize();
		//open url 
		driver.get("https://www.facebook.com/");
		//to get the page tiltle 
		String title = driver.getTitle();
		System.out.println("Title "+title);
		//to get the current url 
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//to quite the browser
		driver.quit();

	}

}
