package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPersonalCabinet {
    private final WebDriver driver;

    public ElementsPersonalCabinet(WebDriver driver) {
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
    //кнопка конструктора
    private By constructorButton = By.xpath(".//p[@class = 'AppHeader_header__linkText__3q_va ml-2' and text() = 'Конструктор']");
    //кнопка выйти из аккаунта
    private By exitButton = By.xpath(".//button[@class = 'Account_button__14Yp3 text text_type_main-medium text_color_inactive' and text() = 'Выход']");
    //заголовок страницы входа
    private By headerSignIn = By.xpath(".//h2[text() = 'Вход']");
    //Кнопка Профиль
    private By profileButton = By.xpath(".//a[@class = 'Account_link__2ETsJ text text_type_main-medium text_color_inactive Account_link_active__2opc9' and text() = 'Профиль']");
    //кнопка Логотипа StellarBurgers
    private By logoBurgerButton = By.className("AppHeader_header__logo__2D0X2");

    @Step("Виден заголовок Вход на странице входа, после выхода из профиля")
    public void headerSignInDisplayedAfterRegistr(){
        driver.findElement(headerSignIn).isDisplayed();
    }

    @Step("Клик по логотипу stellarBurgers со страницы профиля")
    public void clickLogoStellarBurgers(){
        driver.findElement(logoBurgerButton).click();
    }

    @Step("кнопка Профиль в личном кабинете видна")
    public void profileButtonIsDisplayed(){
        driver.findElement(profileButton).isDisplayed();
    }

    @Step("Клик по кнопке Конструктора из личного кабинета")
    public void clickPersonalCabinetButton(){
        driver.findElement(personalCabinetButton).click();
    }

    @Step("Клик по кнопке Конструктора из личного кабинета")
    public void constructorButtonClickFromCabinet(){
        driver.findElement(constructorButton).click();
    }

    @Step("Клик по кнопке Выйти из Личного кабинета")
    public void exitButtonClickFromCabinet(){
        driver.findElement(exitButton).click();
    }

    @Step("Заголовок Вход видимиый")
    public  void headerSignInDisplayed(){
        driver.findElement(headerSignIn).isDisplayed();
    }

    public void checkExitButtonFromPersonalCabinet(){
        exitButtonClickFromCabinet();
        headerSignInDisplayed();
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

    @Step("Войти в личный кабинет после авторизации по кнопке Личный кабинет на главной странице ")
    public void enterPersonalCabinet(String email, String password){
        clickSignInButtonMainPage();
        setEmail(email);
        setPassword(password);
        clickSignInButton();
        headerCraftBurgerAfterSignInDisplayed();
        clickPersonalCabinetButton();
        profileButtonIsDisplayed();
    }

    @Step("Перейти на страницу конструктора из личного кабинета")
    public void enterConstructorButton(String email, String password){
        clickSignInButtonMainPage();
        setEmail(email);
        setPassword(password);
        clickSignInButton();
        headerCraftBurgerAfterSignInDisplayed();
        clickPersonalCabinetButton();
        profileButtonIsDisplayed();
        constructorButtonClickFromCabinet();
        headerCraftBurgerAfterSignInDisplayed();
    }

    @Step("Перейти на главную страницу из личного кабинета по Логотипу")
    public void enterLogoFromPersonalCabinet(String email, String password){
        clickSignInButtonMainPage();
        setEmail(email);
        setPassword(password);
        clickSignInButton();
        headerCraftBurgerAfterSignInDisplayed();
        clickPersonalCabinetButton();
        profileButtonIsDisplayed();
        clickLogoStellarBurgers();
        headerCraftBurgerAfterSignInDisplayed();
    }

    @Step("Проверка выход по кнопке «Выйти» в личном кабинете")
    public void exitButtonFromPersonalCabinet(String email, String password){
        clickSignInButtonMainPage();
        setEmail(email);
        setPassword(password);
        clickSignInButton();
        headerCraftBurgerAfterSignInDisplayed();
        clickPersonalCabinetButton();
        profileButtonIsDisplayed();
        checkExitButtonFromPersonalCabinet();
        headerSignInDisplayedAfterRegistr();
    }


}
