package basic;

import example.CreateUserApi;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.junit.Before;

import static io.restassured.RestAssured.given;

public class DeleteUserApi {

    @Step("DELETE ручка для удаления пользователя")
    public void dasicDeleteApi (String email, String password){
        CreateUserApi createUserApi = new CreateUserApi(email, password);
        RestAssured.baseURI = "https://stellarburgers.nomoreparties.site";
      String accessToken =  given()
              .header("Content-type", "application/json")
              .body(createUserApi)
              .when()
              .post("/api/auth/login").then().extract().path("accessToken").toString();
                given()
                        .header("Content-type", "application/json")
                        .header( "Authorization",accessToken)
                        .when()
                        .delete("/api/auth/user");
    }
}
