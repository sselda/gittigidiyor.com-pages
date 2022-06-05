import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductDetailPage {

    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/User/Selenium/chromedriver/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.gittigidiyor.com/arama/?k=Bilgisayar");
        driver.get("https://www.gittigidiyor.com/arama/?k=Bilgisayar");

        WebElement product = driver.findElement(By.xpath("//div/img[@class='sc-1o6eogh-0 i3yadh-0 gmgqoT sc-1n49x8z-9 jVhkOY']"));
        product.click();


    }

}
