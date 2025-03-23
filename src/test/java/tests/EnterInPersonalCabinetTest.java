package tests;

import basic.BasicTest;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import page.ElementsPersonalCabinet;

public class EnterInPersonalCabinetTest extends BasicTest {

    @DisplayName("Открыть личный кабинет с главной страницы ")
    @Description("Успешный переход в личный кабинет после авторизации по кнопке Личный кабинет на главной странице ")
    @Test
    public void personalCabinetEnterTest(){
        String email = "lilili@yandex.ru";
        String password = "123456";
        ElementsPersonalCabinet elementsPersonalCabinet = new ElementsPersonalCabinet(driver);
        elementsPersonalCabinet.enterPersonalCabinet(email, password);
    }

    @DisplayName("Перейти на страницу конструктора из личного кабинета")
    @Description("Успешный переход на страницу конструктора из личного кабинета")
    @Test
    public void clickAtConstructorButton(){
        String email = "lilili@yandex.ru";
        String password = "123456";
        ElementsPersonalCabinet elementsPersonalCabinet = new ElementsPersonalCabinet(driver);
        elementsPersonalCabinet.enterConstructorButton(email, password);
    }

    @DisplayName("Перейти на главную страницу из личного кабинета по Логотипу")
    @Description("Успешный переход на главную страницу из личного кабинета по Логотипу")
    @Test
    public void transferManePageWithLogoTest(){
        String email = "lilili@yandex.ru";
        String password = "123456";
        ElementsPersonalCabinet elementsPersonalCabinet = new ElementsPersonalCabinet(driver);
        elementsPersonalCabinet.enterLogoFromPersonalCabinet(email, password);
    }

    @DisplayName("Выход по кнопке «Выйти» в личном кабинете")
    @Description("Успешный выход из профиля на главную страницу из личного кабинета по кнопке Выход")
    @Test
    public void exitFromPersonalCabinetTest(){
        String email = "lilili@yandex.ru";
        String password = "123456";
        ElementsPersonalCabinet elementsPersonalCabinet = new ElementsPersonalCabinet(driver);
        elementsPersonalCabinet.exitButtonFromPersonalCabinet(email, password);
    }
}
