package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CreateItemAPITests extends BaseAPITest {

    @Test
    public void createItem() {
        String jsonBody = "{ \"name\": \"Test Item\", \"description\": \"This is a test item\" }";

        Response response = RestAssured
            .given()
            .contentType("application/json")
            .body(jsonBody)
            .post("/items");

        assertEquals(response.getStatusCode(), 201);
    }
}
