import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicsApiTwo {
    public static void main(String[] args){
        RestAssured.baseURI="https://rahulshettyacademy.com";
        given().log().all().queryParam("key","qaclisk123").header("Content-Type", "application/json").
                body(PayLoad.placeDetails()).
        when().post("maps/api/place/add/json").
        then().log().all().assertThat().body("scope", equalTo("APP")).header("User-Agent", "PostmanRuntime/7.29.0");

    }
}
