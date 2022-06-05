import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPages {

    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/User/Selenium/chromedriver/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


            driver.navigate().to("https://www.gittigidiyor.com/uye-girisi?s=1");
            driver.get("https://www.gittigidiyor.com/uye-girisi?s=1");


            driver.findElement(By.id("L-UserNameField")).sendKeys("test7883932@gmail.com");
            driver.findElement(By.id("L-PasswordField")).sendKeys("7883932.Ru");
            driver.findElement(By.id("gg-login-enter")).click();

    }
}



