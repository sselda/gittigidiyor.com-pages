import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class BasketPage {

    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/User/Selenium/chromedriver/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.gittigidiyor.com/bilgisayar-tablet/zeiron-fx60s-i5-3470-16gb-1tb-240gb-ssd-rx550-23-8-oyun-bilgisayari_pdp_631346538");
        driver.get("https://www.gittigidiyor.com/bilgisayar-tablet/zeiron-fx60s-i5-3470-16gb-1tb-240gb-ssd-rx550-23-8-oyun-bilgisayari_pdp_631346538");

        WebElement addBasketbutton = driver.findElement(new By.ByCssSelector("button[class='control-button gg-ui-button plr10 gg-ui-btn-default']"));
        addBasketbutton.click();

        WebElement cartButton = driver.findElement(By.xpath("//div[@class ='header-cart-container robot-header-cart-container hidden'] "));
        cartButton.click();

        Thread.sleep(5000);

        WebElement totalPrice = driver.findElement(new By.ByCssSelector("span.product-new-price"));
        System.out.println(totalPrice.getText());

        String myTotal ="9.299,00 TL";

        Assert.assertEquals(myTotal,totalPrice.getText());

        System.out.println("Fiyat sepete yansımıştır.");


        WebElement removeButton = driver.findElement(By.xpath("//div/i[@class='gg-icon gg-icon-close-thick'] "));
        removeButton.click();

        Thread.sleep(5000);




    }

}