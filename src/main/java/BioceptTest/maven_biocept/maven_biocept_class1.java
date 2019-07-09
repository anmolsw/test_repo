package BioceptTest.maven_biocept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maven_biocept_class1 {
	
	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        driver.get("https://bioceptbetaweb.azurewebsites.net/Account/Login");
        driver.findElement(By.name("Email")).sendKeys("anmol.singh@technossus.com");
        driver.findElement(By.name("Password")).sendKeys("Jan@2019");
        
        driver.findElement(By.id("btn-Login")).click();
        driver.close();
       

}

}
