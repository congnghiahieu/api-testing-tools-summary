import  org.junit.jupiter.api.AfterAll;
import  org.junit.jupiter.api.BeforeAll;
import  org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
import  java.util.Map;
import  java.util.List;
import static org.evomaster.client.java.controller.api.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import  io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import  io.restassured.response.ValidatableResponse;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;
import static org.evomaster.client.java.controller.expect.ExpectationHandler.expectationHandler;
import  org.evomaster.client.java.controller.expect.ExpectationHandler;
import  io.restassured.path.json.JsonPath;
import  java.util.Arrays;




/**
 * This file was automatically generated by EvoMaster on 2023-03-09T15:15:38.385768Z[GMT]
 * <br>
 * The generated test suite contains 4 tests
 * <br>
 * Covered targets: 15
 * <br>
 * Used time: 1h 0m 4s
 * <br>
 * Needed budget for current results: 74%
 * <br>
 * This file contains test cases that represent failed calls, but not indicative of faults.
 */
public class EvoMaster_others_Test {

    
    private static String baseUrlOfSut = "https://restlerdemoserver.pagekite.me";
    /** [ems] - expectations master switch - is the variable that activates/deactivates expectations individual test cases
    * by default, expectations are turned off. The variable needs to be set to [true] to enable expectations
    */
    private static boolean ems = false;
    /**
    * sco - supported code oracle - checking that the response status code is among those supported according to the schema
    */
    private static boolean sco = false;
    /**
    * rso - response structure oracle - checking that the response objects match the responses defined in the schema
    */
    private static boolean rso = false;
    
    
    @BeforeAll
    public static void initClass() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    
    
    
    
    
    
    @Test @Timeout(60)
    public void test_0() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .get(baseUrlOfSut + "/api/doc")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'message'", containsString("this is the docs"));
        
        expectationHandler.expect(ems);
        
        ValidatableResponse res_1 = given().accept("application/json")
                .get(baseUrlOfSut + "/api/blog/posts?per_page=-1355705801")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("per_page must be at least 2."));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 422).contains(res_1.extract().statusCode()));
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/blog/posts")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'items'.size()", equalTo(5))
                .body("'items'[0].'body'", containsString("ßÞÊ"))
                .body("'items'[0].'checksum'", containsString("cc78e"))
                .body("'items'[1].'body'", containsString("ø􅁴񹚔*Í"))
                .body("'items'[1].'checksum'", containsString("41945"))
                .body("'items'[2].'body'", containsString("my first blog post"))
                .body("'items'[2].'checksum'", containsString("68e9a"))
                // Skipping assertions on the remaining 2 elements. This limit of 3 elements can be increased in the configurations
                .body("'per_page'", numberMatches(5.0))
                .body("'page'", numberMatches(10.0))
                .body("'total'", numberMatches(5.0));
        
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/blog/posts/274")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body(containsString("null"));
        
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/blog/posts/789")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body(containsString("null"));
        
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/blog/posts?page=34")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'items'.size()", equalTo(5))
                .body("'items'[0].'body'", containsString("frWpLxl3Qo"))
                .body("'items'[0].'checksum'", containsString("7d0df"))
                .body("'items'[1].'body'", containsString("X92Sm4W7C7kCiK"))
                .body("'items'[1].'checksum'", containsString("f6563"))
                .body("'items'[2].'body'", containsString("oMgcrNDVrWD2"))
                .body("'items'[2].'checksum'", containsString("e6eca"))
                // Skipping assertions on the remaining 2 elements. This limit of 3 elements can be increased in the configurations
                .body("'per_page'", numberMatches(5.0))
                .body("'page'", numberMatches(34.0))
                .body("'total'", numberMatches(5.0));
        
    }
    
    
    @Test @Timeout(60)
    public void test_1() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"id\": -513194733, " + 
                    " \"body\": \"7fjW0yaYrQPdGc\" " + 
                    " } ")
                .post(baseUrlOfSut + "/api/blog/posts")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("ID must be at least 1"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(201, 422).contains(res_0.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_2() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .delete(baseUrlOfSut + "/api/blog/posts/929")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Blog post with id=929 not found."));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(204, 422).contains(res_0.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_3() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"id\": 1520993380, " + 
                    " \"body\": \"f\" " + 
                    " } ")
                .put(baseUrlOfSut + "/api/blog/posts/1520993380")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Blog post with id=1520993380 not found."));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(204, 422).contains(res_0.extract().statusCode()));
    }


}
