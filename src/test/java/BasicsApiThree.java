import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BasicsApiThree {
    public static void main(String[] args){
        RestAssured.baseURI= "https://rahulshettyacademy.com";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"place_id\":\"76bc782bb9335cee30c97feee34cacd0\"\n" +
                        "}")
                .when().delete("maps/api/place/delete/json")
                .then().log().all().assertThat().statusCode(200);

    }
}
