package API_Automation;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Demo_4 {
    public HashMap map = new HashMap();
    @BeforeTest
    public void set_path(){
        RestAssured.baseURI ="https://reqres.in";
        RestAssured.basePath="/api/login";
    }
    @BeforeTest
    public void get_body(){
        map.put("email",utils.email());
        map.put("password",utils.password());
    }
    @Test
    public void set_req(){
        given()
                .contentType("application/json")
                .body(map)



                 .when()
                .post()

                .then()
                .and()
                .log().all();



    }

}
