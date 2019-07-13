package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org"); 
		
		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
/*		
		WebElement username;
		username = driver.findElement(By.id("input-email"));
		username.sendKeys("mytc5@gmail.com");
*/				   
		driver.findElement(By.id("input-email")).sendKeys("mytc5@gmail.com");
	
		
		WebElement Password;
		Password = driver.findElement(By.id("input-password"));
		Password.sendKeys("123456789");
				   
		WebElement loginButton;  
		//loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		loginButton = driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-primary']"));
	
		loginButton.click();
	
		System.out.println("Fianls Resultss");
	
		String actualpagetitle = "";
		String expectedTitle = "My Account";
		actualpagetitle  = driver.getTitle();
	
		System.out.println(actualpagetitle);
		
		if (actualpagetitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		
		String url = "";
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (actualpagetitle.contains("Account")){
            System.out.println("URL Test Passed!");
        } else {
            System.out.println("URL Test Failed");
        }

		driver.close();
		driver.quit();

	}

}
