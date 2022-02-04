package API_Automation;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Demo_3 {
    public HashMap map = new HashMap();
    @BeforeClass
    public void set_path(){
        RestAssured.baseURI ="https://reqres.in";
        RestAssured.basePath ="/api/users";
    }
    @BeforeClass
    public void set_body(){
        map.put("name",utils.getname());
        map.put("job",utils.getjob());
    }
    @Test
    public void set_req(){
        given()
                .body(map)

                .when()
                   .post()

                          .then()
                           .log().all();
    }
}
