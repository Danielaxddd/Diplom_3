package tests;

import basic.BasicTest;
import basic.DeleteUserApi;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import page.ElementsOfRegistrationPage;
import static com.codeborne.selenide.Selenide.open;
import page.ElementsOfEntryPage;

public class RegistrationTest extends BasicTest {

    @DisplayName("Успешная регистрация")
    @Description("Проверка успешной регистрации")
    @Test
    public void NewUserTest(){
        String name = "lilil52wi";
        String email = "lilil52wi@yandex.ru";
        String password = "123456";
        DeleteUserApi deleteUserApi = new DeleteUserApi();
        ElementsOfRegistrationPage elementsOfRegistrationPage = new ElementsOfRegistrationPage(driver);
        elementsOfRegistrationPage.makeRegistrationUser(name, email, password);
        deleteUserApi.dasicDeleteApi(email, password);
    }

    @DisplayName("Ошибка при регистрации с коротким паролем")
    @Description("Ошибка некорректный пароль при попытке регистрации с паролем из 5 симловлов")
    @Test
    public void NewUserShortPasswordTest(){
        String name = "lululu";
        String email = "lululu@yandex.ru";
        String password = "12345";
        ElementsOfRegistrationPage elementsOfRegistrationPage = new ElementsOfRegistrationPage(driver);
        elementsOfRegistrationPage.registrationNewUserShortPassword(name, email, password);
    }
}
