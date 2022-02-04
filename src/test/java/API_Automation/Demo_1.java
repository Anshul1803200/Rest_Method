package API_Automation;

import io.restassured.RestAssured;
import io.restassured.specification.Argument;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.apache.commons.lang3.StringUtils.contains;

public class Demo_1 {

    @BeforeClass
    public void uri_setup(){
        RestAssured.baseURI="https://reqres.in";
        RestAssured.basePath="/api/users";
    }
    @Test
    public void request(){
        given()

                .when()
                   .get()

                .then()
                .statusCode(200)
                .log().all();

    }

     {
    }


}

