package tests;

import basic.BasicTest;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import page.ElementsOfConstructor;

public class MoveInConstructorCategoryTest extends BasicTest {

    @DisplayName("Успешный переход к катгории булки")
    @Description("Проверка перехода к категории булки из категории Соусы")
    @Test
    public void ConstructorBunButtonTest(){
        ElementsOfConstructor elementsOfConstructor = new ElementsOfConstructor(driver);
        elementsOfConstructor.clickBunButtonInConstructor();
    }

    @DisplayName("Успешный переход к категории Соусы")
    @Description("Проверка перехода к категории Соусы из категории Булки")
    @Test
    public void ConstructorSouceButtonTest(){
        ElementsOfConstructor elementsOfConstructor = new ElementsOfConstructor(driver);
        elementsOfConstructor.clickSouceButtonInConstructor();
    }

    @DisplayName("Успешный переход к категории Начинки")
    @Description("Проверка перехода к категории Начинки из категории Булки")
    @Test
    public void ConstructorFillingButtonTest(){
        ElementsOfConstructor elementsOfConstructor = new ElementsOfConstructor(driver);
        elementsOfConstructor.clickFillingButtonInConstructor();
    }
}
