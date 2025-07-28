package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DeleteItemAPITests extends BaseAPITest {

    @Test
    public void deleteItem() {
        Response response = RestAssured
            .given()
            .delete("/items/1"); // Adjust ID accordingly

        assertEquals(response.getStatusCode(), 200); // or 204 depending on API behavior
    }
}
