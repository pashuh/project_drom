package tests;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.json.JSONObject;
import pages.AuthPage;
import pojo.UserPojo;

import static com.codeborne.selenide.Selenide.open;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static specs.AuthSpec.authRequestSpec;
import static specs.AuthSpec.getAuthResponseSpec;

public class Api extends TestBase {
    AuthPage auth = new AuthPage();

//    @BeforeAll
//    static void setUp() {
//        RestAssured.baseURI = "https://auto.drom.ru/";
//    }

//    @Test
//    @Tag("API")
//    @DisplayName("Поиск авто c с параметрами: mitsubishi, outlander, АКПП")
//    void authTestAPI2() {
//        open();
//        auth.openPage();
//        String response = given()
//                .spec(authRequestSpec)
//                .when()
//                .get("")
//                .then()
//                .spec(getAuthResponseSpec)
//                .extract()
//                .body().asString();
//        assertTrue(response.contains("АКПП"));
//        assertTrue(response.contains("mitsubishi"));
//        assertTrue(response.contains("outlander"));
//    }
//
//    @Test
//    @Tag("API")
//    @DisplayName("Поиск авто марки Форд с передним приводом")
//    void authTestAPI4() {
//        auth.openPage();
//        String response = given()
//                .accept("text/html")
//                .queryParam("privod", "1")
//                .when()
//                .get("https://auto.drom.ru/ford/all/")
//                .then()
//                .statusCode(200)
//                .extract()
//                .body().asString();
//        System.out.println(response);
//        assertTrue(response.contains("Передний"));
//        assertTrue(response.contains("Форд"));
//    }
//
//    @Test
//    @Tag("API")
//    @DisplayName("Отсутствие Авто с АКПП при поиске авто на механической КПП")
//    void authTestAPI5() {
//        auth.openPage();
//        String response = given()
//                .accept("text/html")
//                .queryParam("transmission[]", "1")
//                .when()
//                .get("https://auto.drom.ru/all/")
//                .then()
//                .statusCode(200)
//                .extract()
//                .body().asString();
//        System.out.println("result" + response);
//        assertFalse(response.contains("АКПП"));
//    }
//
//    @Test
//    @Tag("API")
//    @DisplayName("Раздел 'Избранные объявления' пуст при открытии не авторизованным пользователем")
//    void authTestAPI6() {
//        auth.openPage();
//        String response = given()
//                .accept("text/html")
//                .when()
//                .get("https://my.drom.ru/personal/bookmark")
//                .then()
//                .statusCode(200)
//                .extract()
//                .body().asString();
//        System.out.println("result" + response);
//        assertTrue(response.contains("Избранные объявления"));
//        assertTrue(response.contains("Вы ничего не добавили в избранное"));
//    }
//
//    @Test
//    @Tag("API")
//    @DisplayName("Наличие в Разделе 'Каталог' марки Opel")
//    void authTestAPI7() {
//        auth.openPage();
//        String response = given()
//                .accept("text/html")
//                .when()
//                .get("https://www.drom.ru/catalog")
//                .then()
//                .statusCode(200)
//                .extract()
//                .body().asString();
//        System.out.println("result" + response);
//        assertTrue(response.contains("Opel"));
//        assertTrue(response.contains("Каталог автомобилей"));
//    }
}
