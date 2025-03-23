package basic;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static page.ElementsOfConstructor.LINK_STELLAR_BURGER;

abstract public class BasicTest {
    protected WebDriver driver;
    @Before
    @Step("set Up")
    public void setUp() {
        //initChrome();
        initYandexBrowser();
        driver.get(LINK_STELLAR_BURGER);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void initChrome(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }
    public void initYandexBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\79163\\Documents\\YandexDriverWeb\\yandexdriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
