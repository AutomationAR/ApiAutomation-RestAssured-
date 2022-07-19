package sampleTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class restAPI {

	@Test
	public void getApi() {
		given()
		.when()
		.get("https://gorest.co.in/public/v2/posts")
		.then()
		.statusCode(200)
		.assertThat()
		.header("CF-Cache-Status", "DYNAMIC");

	}

}
