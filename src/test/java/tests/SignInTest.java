package tests;

import basic.BasicTest;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import page.ElementsOfEntryPage;

public class SignInTest extends BasicTest {

    @DisplayName("Успешная авторизация с главной страницы")
    @Description("Проверка успешной авторизации через кнопку Войти на главной странице")
    @Test
    public void SignInFromMainPageTest(){
        String email = "lilili@yandex.ru";
        String password = "123456";
        ElementsOfEntryPage elementsOfEntryPage = new ElementsOfEntryPage(driver);
        elementsOfEntryPage.SignInFromManePage(email, password);
    }
    @DisplayName("Успешная авторизация из личного кабинета")
    @Description("Проверка успешной авторизации через кнопку Личный кабинет")
    @Test
    public void SignInFromPersonalCabinetTest(){
        String email = "lilili@yandex.ru";
        String password = "123456";
        ElementsOfEntryPage elementsOfEntryPage = new ElementsOfEntryPage(driver);
        elementsOfEntryPage.signInFromPersonalCabinetButton(email, password);
    }

    @DisplayName("Успешная авторизация с переходом из формы регистрации")
    @Description("Проверка успешной авторизации через кнопку Войти на экране Регистрации")
    @Test
    public void SignInFromRegistrationPageTest(){
        String email = "lilili@yandex.ru";
        String password = "123456";
        ElementsOfEntryPage elementsOfEntryPage = new ElementsOfEntryPage(driver);
        elementsOfEntryPage.signInFromRegistrationForm(email, password);
    }

    @DisplayName("Успешная авторизация через экран Восстановление пароля")
    @Description("Проверка успешной авторизации через экран Восстановить пароль")
    @Test
    public void SignInFromRecoverPasswordButtonTest(){
        String email = "lilili@yandex.ru";
        String password = "123456";
        ElementsOfEntryPage elementsOfEntryPage = new ElementsOfEntryPage(driver);
        elementsOfEntryPage.signInFromRecoverPasswordButton(email, password);
    }
}
