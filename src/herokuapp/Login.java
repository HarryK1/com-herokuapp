package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */
public class Login {

    static String baseUrl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) throws InterruptedException {

        //setup browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl); // open URL into browser
        //maximise browser
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print the title of the page
        System.out.println(driver.getTitle());

        //print the current url
        System.out.println(driver.getCurrentUrl());

        //print the page source
        System.out.println(driver.getPageSource());
        Thread.sleep(4000);

        //enter the email to email field
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("tomsmith");
        Thread.sleep(4000);

        //find password field and type password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");
        Thread.sleep(4000);

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(4000);

        //print the current url
        System.out.println(driver.getCurrentUrl());

        //refresh the page
        driver.navigate().refresh();

        //close the browser
        driver.quit();

    }
}
