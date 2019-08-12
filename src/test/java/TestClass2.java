import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass2 {

  WebDriver _webdriver;

  @Test
  public void method1() throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "/Users/firstlast/Desktop/SELENIUM/GeckoDriver/geckodriver");
    _webdriver = new FirefoxDriver();
    System.out.println("test running code 2");

    _webdriver.get("https://google.com");
    Thread.sleep(2000);
    _webdriver.quit();
  }
}
