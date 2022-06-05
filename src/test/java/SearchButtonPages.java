import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchButtonPages {

    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/User/Selenium/chromedriver/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.gittigidiyor.com/");
        driver.get("https://www.gittigidiyor.com/");


        WebElement searchbutton = driver.findElement(By.name("k"));
        searchbutton.sendKeys("Bilgisayar");
        searchbutton.sendKeys(Keys.ENTER);







    }
}
