package test1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	@Test
	public void Login() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//To maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("Amazon");
		//To maximize the window
	}

}
