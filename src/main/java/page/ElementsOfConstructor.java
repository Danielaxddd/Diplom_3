package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsOfConstructor {
    public static final String LINK_STELLAR_BURGER = "https://stellarburgers.nomoreparties.site/";

    private WebDriver driver;

    public ElementsOfConstructor(WebDriver driver) {
        this.driver = driver;
    }

    //кнопка личный кабинет
    private By personalCabinetButton = By.xpath(".//p[@class = 'AppHeader_header__linkText__3q_va ml-2' and text() = 'Личный Кабинет']");
    //кнопка булки
    private By bunButton = By.xpath(".//span[@class = 'text text_type_main-default' and text() = 'Булки']");
    //кнопка соусы
    private By souceButton = By.xpath(".//span[@class = 'text text_type_main-default' and text() = 'Соусы']");

    private By fillingButton = By.xpath(".//span[@class = 'text text_type_main-default' and text() = 'Начинки']");

    private By fluorescentBreadElement = By.xpath(".//p[@class = 'BurgerIngredient_ingredient__text__yp3dH' and text() = 'Флюоресцентная булка R2-D3']");

    private By spicySouceElement = By.xpath(".//p[@class = 'BurgerIngredient_ingredient__text__yp3dH' and text() = 'Соус Spicy-X']");

    private By meatMolluscElement = By.xpath(".//p[@class = 'BurgerIngredient_ingredient__text__yp3dH' and text() = 'Мясо бессмертных моллюсков Protostomia']");
    //кнопка Войти в аккаунт с главной страницы
    private By SignInAccountButton = By.xpath(".//button[@class = 'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg' and text() = 'Войти в аккаунт']");
    //Заголовок Соберите бургер
    private By headerCraftBurger = By.xpath(".//h1[@class = 'text text_type_main-large mb-5 mt-10' and text() = 'Соберите бургер']");

    @Step("Заголовок Coберите бургер отображается ")
    public void makeBurgerHeader(){
        driver.findElement(headerCraftBurger).isDisplayed();
    }

    @Step("Клик по кнопке Булки")
    public void clickBunButton(){
        driver.findElement(bunButton).click();
    }

    @Step("Элемент Флюорисцентная булка видимиый")
    public void bunElementsIsDisplayed(){
        driver.findElement(fluorescentBreadElement).isDisplayed();
    }

    @Step("Клик по кнопке Соус")
    public void clickSouseButton(){
        driver.findElement(souceButton).click();
    }

    @Step("Элемент Спайси соус видимый")
    public void souceElementIsDisplayed(){
        driver.findElement(spicySouceElement).isDisplayed();
    }

    @Step("Клик по кнопке Начинка")
    public void clickFillingButton(){
        driver.findElement(fillingButton).click();
    }

    @Step("Элемент Мясо Моллюска видимый")
    public void fillingElementIsDisplayed(){
        driver.findElement(meatMolluscElement).isDisplayed();
    }

    @Step("Проверка перехода к булкам после клика на кнопку Булки в конструкторе")
    public void clickBunButtonInConstructor(){
        makeBurgerHeader();
        clickSouseButton();
        clickBunButton();
        bunElementsIsDisplayed();
    }

    @Step("Проверка перехода к соусам после клика на кнопку Соусы в конструкторе")
    public void clickSouceButtonInConstructor(){
        makeBurgerHeader();
        clickSouseButton();
        souceElementIsDisplayed();
    }

    @Step("Проверка перехода к соусам после клика на кнопку Соусы в конструкторе")
    public void clickFillingButtonInConstructor(){
        makeBurgerHeader();
        clickFillingButton();
        fillingElementIsDisplayed();
    }
}
