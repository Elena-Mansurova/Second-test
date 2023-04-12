import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTest {

    @Test

    public void myTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.co.jp/");

        WebElement search = driver.findElement(By.name("p"));

        search.sendKeys("rakuten");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"ContentWrapper\"]/header/section[1]/div/form/fieldset/span/button"));

        button.click();

        WebElement link = driver.findElement(By.xpath("//*[@id=\"contents__wrap\"]/div[1]/div[2]/div[1]/div/section/div[1]/div/div/a/div/div/cite"));

        Assert.assertEquals(link.getText(), "https://www.rakuten.co.jp");

        driver.quit();

    }
}
