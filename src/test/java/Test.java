import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.jupiter.api.Test
    public void testRestAssured () {
        Response response = RestAssured.given()
                .auth().oauth2("faw6Oq33HdwXLQk-I8oc209_Z-RIEH2JH7d7")
                .queryParam("first_name","Brian")
                .queryParam("last_name","Ratke")
                .queryParam("gender","male")
                .queryParam("email","kss@roberts.com")
                .queryParam("status","active")
                .get("https://gorest.co.in/public-api/users");
        Assertions.assertEquals(200, response.getStatusCode());
        response.body().prettyPrint();
    }
}
