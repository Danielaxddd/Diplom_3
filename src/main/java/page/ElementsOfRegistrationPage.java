package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ElementsOfRegistrationPage {
    private final WebDriver driver;

    public ElementsOfRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    //кнопка Войти в аккаунт с главной страницы
    private By signInAccountButton = By.xpath(".//button[@class = 'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg' and text() = 'Войти в аккаунт']");
    //кнопка Зарегистрироваться на странице Входа
    private By registrationLink = By.xpath(".//a[@class = 'Auth_link__1fOlj' and text() = 'Зарегистрироваться']");
    //заголовок регистрация
    private By headerRegistration = By.xpath(".//h2[contains(text(),'Регистрация')]");
    //поле имя
    private By fieldNameRegistrForm = By.xpath(".//label[contains(text(),'Имя')]/parent::div/input");
    //поле имеил
    private By fieldEmailRegistrForm = By.xpath(".//label[contains(text(),'Email')]/parent::div/input");
    //поле пароль
    private By fieldPasswordRegistrForm = By.xpath(".//label[contains(text(),'Пароль')]/parent::div/input");
    //кнопка зарегистрироватся
    private By registrButtonRegForm = By.xpath(".//button[contains(text(),'Зарегистрироваться')]");
    //заголовок Вход
    private By headerSignIn = By.xpath(".//h2[text() = 'Вход']");
    //Ошибка некорректный паролль
    private By mistakeUncorrectPassword = By.xpath(".//p[@class = 'input__error text_type_main-default' and text() = 'Некорректный пароль']");
    //кнопка войти после регистрации
    private By SignInButtonRegistrForm = By.xpath(".//a[contains(text(),'Войти')]");

    @Step("Войти в аккаунт на главное странице")
    public void clickSignInAccountButton(){
        driver.findElement(signInAccountButton).click();
    }

    @Step("Клик по кнопке Зарегистрироваться на странице входа")
    public void clickRegistrationLinkButton(){
        driver.findElement(registrationLink).click();
    }

    @Step("Заголовок Регистрация виден")
    public void headerRegistrationDisplayed(){
        driver.findElement(headerRegistration).isDisplayed();
    }

    @Step("Ввести Имя")
    public void setName(String name){
        driver.findElement(fieldNameRegistrForm).sendKeys(name);

    }

    @Step("Ввести email")
    public void setEmail(String email){
        driver.findElement(fieldEmailRegistrForm).sendKeys(email);
    }

    @Step("Ввести пароль")
    public void setPassword(String password){
        driver.findElement(fieldPasswordRegistrForm).sendKeys(password);
    }

    @Step("Клик по кнопке регистрации")
    public void clickRegistrationButton(){
        driver.findElement(registrButtonRegForm).click();
    }

    @Step("Ошибка некорректный пароль видна")
    public void uncorrectPasswordIsDisplayed(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(mistakeUncorrectPassword).isDisplayed();
    }
    @Step("Виден заголовок Вход на странице входа, после регистрации")
    public void headerSignInDisplayedAfterRegistr(){
        driver.findElement(headerSignIn).isDisplayed();
    }

    public void makeRegistrationUser(String name, String email, String password){
        clickSignInAccountButton();
        clickRegistrationLinkButton();
        headerRegistrationDisplayed();
        setName(name);
        setEmail(email);
        setPassword(password);
        clickRegistrationButton();
        headerSignInDisplayedAfterRegistr();
    }

    public void registrationNewUserShortPassword(String name, String email, String password) {
        clickSignInAccountButton();
        clickRegistrationLinkButton();
        headerRegistrationDisplayed();
        setName(name);
        setEmail(email);
        setPassword(password);
        clickRegistrationButton();
        uncorrectPasswordIsDisplayed();
    }
}
