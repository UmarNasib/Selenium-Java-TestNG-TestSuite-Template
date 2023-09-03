import org.testng.annotations.Test;

public class LoginTest extends ChromeWebDriverManager {
  @Test
  void checkTheUrl() {
    driver.get("https://www.google.com/");

    System.out.println(driver.getTitle());
  }
}