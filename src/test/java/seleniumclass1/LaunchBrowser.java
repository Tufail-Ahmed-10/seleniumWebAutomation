package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        WebDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
