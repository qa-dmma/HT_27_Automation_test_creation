import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Test {

    private WebDriver driver;

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement enter_button = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[20]/td/p/a/b"));
        enter_button.click();
        WebElement sing_up_button = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));
        sing_up_button.click();
        WebElement element2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]"));
        element2.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
