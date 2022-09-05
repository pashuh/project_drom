package tests.Api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;
import static specs.SpecForApi.*;

public class ApiTests{

    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "https://auto.drom.ru/";
    }

    @Test
    @Tag("api")
    @DisplayName("Search for a car with parameters: mitsubishi, outlander, АКПП")
    void searchForParamTestApi() {
        String response = given()
                .spec(searchFroParamRequestSpec)
                .when()
                .get("")
                .then()
                .spec(getSearchFroParamResponseSpec)
                .extract()
                .body().asString();
        assertTrue(response.contains("АКПП"));
        assertTrue(response.contains("mitsubishi"));
        assertTrue(response.contains("outlander"));
    }

    @Test
    @Tag("api")
    @DisplayName("Search for a Ford car with front-wheel drive")
    void searchFordTestApi() {
        String response = given()
                .spec(searchFordRequestSpec)
                .when()
                .get("ford/all/")
                .then()
                .spec(getSearchFordResponseSpec)
                .extract()
                .body().asString();
        assertTrue(response.contains("Передний"));
        assertTrue(response.contains("Форд"));
    }

    @Test
    @Tag("api")
    @DisplayName("The absence of a car with automatic transmission when searching for a car on a manual transmission")
    void automaticTransmissionTestApi() {
        String response = given()
                .spec(automaticTransmissionRequestSpec)
                .when()
                .get("all/")
                .then()
                .spec(getautomaticTransmissionResponseSpec)
                .extract()
                .body().asString();
        System.out.println("result" + response);
        assertFalse(response.contains("АКПП"));
    }

    @Test
    @Tag("api")
    @DisplayName("Error when opening 'Favorite Ads' by an unauthorized user")
    void favoriteTestApi() {
        String response = given()
                .spec(favoriteRequestSpec)
                .when()
                .get("/personal/bookmark")
                .then()
                .spec(getFavoriteResponseSpec)
                .extract()
                .body().asString();
        System.out.println("result" + response);
        assertTrue(response.contains("Запрошенная вами страница не существует!"));
    }

    @Test
    @Tag("api")
    @DisplayName("Availability in the Section 'Catalog' Opel brands")
    void catalogTestApi() {
        String response = given()
                .spec(catalogRequestSpec)
                .when()
                .get("https://drom.ru/catalog/")
                .then()
                .spec(getCatalogResponseSpec)
                .extract()
                .body().asString();
        System.out.println("result" + response);
        assertTrue(response.contains("Opel"));
        assertTrue(response.contains("Каталог автомобилей"));
    }
}
