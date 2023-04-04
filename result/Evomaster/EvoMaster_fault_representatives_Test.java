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
 * This file was automatically generated by EvoMaster on 2023-03-23T09:24:30.790762Z[GMT]
 * <br>
 * The generated test suite contains 2 tests
 * <br>
 * Covered targets: 6
 * <br>
 * Used time: 1h 0m 3s
 * <br>
 * Needed budget for current results: 100%
 * <br>
 * This file contains one example of each category of fault. The test cases in this file are a subset of the set of test cases likely to indicate faults.
 */
public class EvoMaster_fault_representatives_Test {

    
    private static String baseUrlOfSut = "https://next.kemongmo.com";
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
    public void test_0_with500() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjciLCJleHAiOjE2Nzk2NDYxNzJ9.p4NvnfbvTkG1shVA_wiZfVfNXVXcqXvYv95gt-qPGvE") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("start_date=f9gPFF7&end_date=P2S_KxJp_3")
                .post(baseUrlOfSut + "/v1/ranking/period")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("Internal Server Error"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_0.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_1() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjciLCJleHAiOjE2Nzk2NDYxNzJ9.p4NvnfbvTkG1shVA_wiZfVfNXVXcqXvYv95gt-qPGvE") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("nick_name=ZS&date_of_birth=ZUILrhP&avatar=")
                .put(baseUrlOfSut + "/v1/users/update_info")
                .then()
                .statusCode(422)
                .assertThat()
                .contentType("application/json")
                .body("'detail'.size()", equalTo(1))
                .body("'detail'[0].'loc'.size()", equalTo(2))
                .body("'detail'[0].'loc'", hasItems("body", "avatar"))
                .body("'detail'[0].'msg'", containsString("field required"))
                .body("'detail'[0].'type'", containsString("value_error.missing"));
        
        expectationHandler.expect(ems)
            .that(rso, ((Map) res_0.extract().response().jsonPath().getJsonObject("")).keySet().containsAll(Arrays.asList()));
    }


}