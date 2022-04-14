import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicsApiOne {
    public static void main(String[] args){
        //given- all input details
        //when- submit
        //then- response validation
        RestAssured.baseURI="https://rahulshettyacademy.com";
        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").
                body(PayLoad.placeDetails()).
        when().post("maps/api/place/add/json").
        then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"));
    }
}
