import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("vpusewwandi@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("cvcvcvvvnnn");
        driver.findElement(By.id("loginbutton")).click();
    }
}
