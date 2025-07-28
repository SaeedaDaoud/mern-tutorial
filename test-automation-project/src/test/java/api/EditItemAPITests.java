package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EditItemAPITests extends BaseAPITest {

    @Test
    public void editItem() {
        String jsonBody = "{ \"name\": \"Updated Item\", \"description\": \"Updated description\" }";

        Response response = RestAssured
            .given()
            .contentType("application/json")
            .body(jsonBody)
            .put("/items/1"); // Update ID as needed

        assertEquals(response.getStatusCode(), 200);
    }
}
