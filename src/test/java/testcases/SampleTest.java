package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by vikas.kumar1 on 16-07-2017.
 */
public class SampleTest {

    @Test
    public void test12() throws Exception{
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

    }

}