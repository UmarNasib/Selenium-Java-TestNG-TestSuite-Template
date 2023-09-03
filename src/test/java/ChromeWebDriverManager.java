import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

class ChromeWebDriverManager {
  WebDriver driver = new ChromeDriver();

  @BeforeTest
  void setup() throws InterruptedException {
    driver.manage().window().maximize();
    Thread.sleep(5000);
  }

  @AfterTest
  void teardown() {
    driver.quit();
  }
}
