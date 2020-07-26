package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser_Manager extends Util
{
    public void setBrowser() // create Method for start up browser
    {
        // setting up chrome driver path
        System.setProperty("webdriver.chrome.driver","src\\test\\Browser_Manager\\chromedriver.exe");
        // create chrome driver object to open Google Chrome browser
        driver=new ChromeDriver();
        // maximising screen
        driver.manage().window().maximize();
        // Applying implicitly wait of 10 sec to driver instance
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // open the URL
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
    }
    // create new method for Close Browser
    public void closeBrowser() { driver.close();}// reusable method to close browser
}
