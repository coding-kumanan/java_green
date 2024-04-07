package seleniumJavaPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumanan\\Downloads\\chrome-win64\\chrome.exe");
		// TO initiate chromedriver, driver is a object
		WebDriver driver=new ChromeDriver();
		// driver.get used to take action on browser. to say browser to open websites.
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		//implicite wait ask selenium to wait for a period of time. 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//derver.getTile is used to get the title of the website. 
		System.out.println(driver.getTitle());
		
		//find element on a websites
		
		WebElement textbox = driver.findElement(By.name("my-text"));
		WebElement Button = driver.findElement(By.cssSelector("button"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		//WebElement message = driver.findElement(By.tagName("h1"));
		//Take action on element
		
		textbox.sendKeys("Selenium");
		Button.click();
		//System.out.println(message.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.quit();
		
		
		

	}

}
