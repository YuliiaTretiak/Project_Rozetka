import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SearchResultsPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BasePageTest {
    private WebDriver driver;
    private static final String ROZETKA_URL = "https://rozetka.com.ua/ua/";


    public void setUp() {
        chromedriver().setup();
    }


    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ROZETKA_URL);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultsPage getSearchResultsPage () {return new SearchResultsPage(getDriver());}

    public void tearDown() {
        driver.close();
    }
}
