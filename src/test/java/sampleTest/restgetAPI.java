package sampleTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class restgetAPI {

	@Test
	public void gettAPI() {
		
		given()

		.when()
		.get("https://gorest.co.in/public/v2/users")

		.then()
		.statusCode(200)
		.assertThat().header("Server", "cloudflare");
	}

}
