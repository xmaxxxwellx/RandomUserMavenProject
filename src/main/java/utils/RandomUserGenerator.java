package utils;

import dto.Result;
import dto.User;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;

public class RandomUserGenerator {

    public User getRandomUser() {
        return given()
                .when()
                .get("https://randomuser.me/api")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract().as(Result.class)
                .getResults().get(0);
    }
}
