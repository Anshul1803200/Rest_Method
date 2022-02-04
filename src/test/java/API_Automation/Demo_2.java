package API_Automation;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Demo_2 {
    public HashMap map = new HashMap();
        @BeforeClass
        public void uri_setup() {
            RestAssured.baseURI = "https://reqres.in";
            RestAssured.basePath = "/api/users";
        }
        @BeforeClass
        public void queryparms(){
            map.put("id", utils.get_id());
        }


        @Test
        public void getData() {
            given()
                    .queryParams(map)

                    .when()
                    .get()

                    .then()
                    .statusCode(200)
//                    .body("data.first_name", equalTo("Janet"))
                    .log().all();

        }
    }

