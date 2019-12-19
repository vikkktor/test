package com.goodline.homework;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
public class ApiTests {



    @Test
    @DisplayName("g")
    public void test(){
        given()
                .param("apikey","5fa2a4b2-b0c3-42cc-b72f-26521af1c706")
        .param("lat", "55.3")
        .param("lng", "86")
        .when()
                .get("https://api.rasp.yandex.net/v3.0/nearest_settlement/")
        .then()
                .log().all()
                .statusCode(200)
                .body("title", equalTo("Кемерово"))
                .body("code" ,equalTo("c64"));

    }

}
