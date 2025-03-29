package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;

public class ElementsOfEntryPage {

    public static String MAIN_PAGE_URL = "https://stellarburgers.nomoreparties.site/";

    private final WebDriver driver;

    public ElementsOfEntryPage(WebDriver driver){
        this.driver = driver;
    }
    //заголовок входа
    private By headerEntry = By.xpath(".//h2[text() = 'Вход']");
    //поле email
    private By emailField = By.xpath(".//label[contains(text(), 'Email')]/parent::div/input");
    //поле пароль
    private By passwordField = By.xpath(".//label[contains(text(), 'Пароль')]/parent::div/input");
    //кнопка войти
    private By entryButton = By.xpath(".//button[@class = 'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa' and text() = 'Войти']");
    //Кнопка Войти в аккаунт. На главной странице
    private By signInButtonMainPage = By.xpath(".//button[@class = 'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg' and text() = 'Войти в аккаунт']");
    //Заголовок Соберите бургер
    private By headerCraftBurger = By.xpath(".//h1[@class = 'text text_type_main-large mb-5 mt-10' and text() = 'Соберите бургер']");
    //Кнопка Личный кабинет
    private By personalCabinetButton = By.xpath(".//p[@class = 'AppHeader_header__linkText__3q_va ml-2' and text() = 'Личный Кабинет']");
    //кнопка Войти в форме регистрации
    private By signInButtonRegistrForm = By.xpath(".//a[contains(text(),'Войти')]");
    //кнопка Зарегистрироваться на странице Входа
    private By registrationLink = By.xpath(".//a[@class = 'Auth_link__1fOlj' and text() = 'Зарегистрироваться']");
    //кнопка восстанеовить пароль на странице входа
    private By recoverPasswordButton = By.xpath(".//a[@class = 'Auth_link__1fOlj' and text() = 'Восстановить пароль']");
    //кнопка Войти на странице восстановления пароля
    private By signInButtonFromRecoverPasswordPage = By.xpath(".//a[@class = 'Auth_link__1fOlj' and text() = 'Войти']");

    @Step("Клик по кнопке Войти на странице восстановления пароля")
    public void clickSignInButtonFromRecoverPasswordPage(){
        driver.findElement(signInButtonFromRecoverPasswordPage).click();
    }

    @Step("Клик по кнопке Восстановить пароль на странице входа")
    public void clickRecoverPasswordButton(){
        driver.findElement(recoverPasswordButton).click();
    }

    @Step("Клик по кнопке Войти на странице регистрации")
    public void clickSignInButtonFromRegPage(){
        driver.findElement(signInButtonRegistrForm).click();
    }

    @Step("Клик по кнопке Личный кабинет")
    public void clickSignInPersonalCabinetButton(){
        driver.findElement(personalCabinetButton).click();
    }

    @Step("Клик по кнопке Зарегистрироваться на странице входа")
    public void clickRegistrationLinkButton(){
        driver.findElement(registrationLink).click();
    }

    @Step("Клик по кнопке Войти в аккаунт на главное странице")
    public void clickSignInButtonMainPage(){
        driver.findElement(signInButtonMainPage).click();
    }

    @Step("Ввести email")
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    @Step("Вести пароль")
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    @Step("Кликнуть по кнопке Войти")
    public void clickSignInButton(){
        driver.findElement(entryButton).click();
    }
    @Step("Заголовок Соберите бургер виден")
    public void headerCraftBurgerAfterSignInDisplayed(){
        driver.findElement(headerCraftBurger).isDisplayed();
    }

    public void SignInFromManePage(String email, String password){
        clickSignInButtonMainPage();
        setEmail(email);
        setPassword(password);
        clickSignInButton();
        headerCraftBurgerAfterSignInDisplayed();
    }

    public void signInFromPersonalCabinetButton(String email, String password){
        clickSignInPersonalCabinetButton();
        setEmail(email);
        setPassword(password);
        clickSignInButton();
        headerCraftBurgerAfterSignInDisplayed();
    }

    public void signInFromRegistrationForm(String email, String password){
        clickSignInPersonalCabinetButton();
        clickRegistrationLinkButton();
        clickSignInButtonFromRegPage();
        setEmail(email);
        setPassword(password);
        clickSignInButton();
        headerCraftBurgerAfterSignInDisplayed();
    }

    public void signInFromRecoverPasswordButton(String email, String password){
        clickSignInButtonMainPage();
        clickRecoverPasswordButton();
        clickSignInButtonFromRecoverPasswordPage();
        setEmail(email);
        setPassword(password);
        clickSignInButton();
        headerCraftBurgerAfterSignInDisplayed();
    }
}