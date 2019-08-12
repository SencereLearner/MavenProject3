import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class TestClass1 {



WebDriver _webdriver;


  @Test
  public void method1() throws InterruptedException {

  System.setProperty("webdriver.chrome.driver", "/Users/firstlast/Desktop/SELENIUM/ChromeDriver/chromedriver");
  _webdriver = new ChromeDriver();

    System.out.println("test running code");


    _webdriver.get("https://google.com");
    Thread.sleep(2000);
    _webdriver.quit();

  }
}
