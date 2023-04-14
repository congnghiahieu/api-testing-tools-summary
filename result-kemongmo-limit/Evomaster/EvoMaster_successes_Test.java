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
 * This file was automatically generated by EvoMaster on 2023-04-07T16:37:22.381429Z[GMT]
 * <br>
 * The generated test suite contains 14 tests
 * <br>
 * Covered targets: 33
 * <br>
 * Used time: 1h 0m 0s
 * <br>
 * Needed budget for current results: 99%
 * <br>
 * This file contains test cases that represent successful calls.
 */
public class EvoMaster_successes_Test {

    
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
    public void test_0() throws Exception {
        
        given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "/v1/notification/type?" + 
                    "date_input=1947-12-14T19%3A40%3A48&" + 
                    "date_type=Year")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
        
    }
    
    
    @Test @Timeout(60)
    public void test_1() throws Exception {
        
        given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .post(baseUrlOfSut + "/v1/ranking/ranking_calculate")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'result'", containsString("OK"))
                .body("'error'", nullValue());
        
    }
    
    
    @Test @Timeout(60)
    public void test_2() throws Exception {
        
        given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "/v1/records/my_records")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
        
    }
    
    
    @Test @Timeout(60)
    public void test_3() throws Exception {
        
        given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .post(baseUrlOfSut + "/v1/users/overview_user")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'nick_name'", containsString("iwannatest"))
                .body("'distance'", numberMatches(0.0))
                .body("'duration'", numberMatches(0.0))
                .body("'week'", numberMatches(0.0))
                .body("'month'", numberMatches(0.0))
                .body("'year'", numberMatches(0.0));
        
    }
    
    
    @Test @Timeout(60)
    public void test_4() throws Exception {
        
        given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .post(baseUrlOfSut + "/v1/users/overview?date_type=Month")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'distance'", numberMatches(0.0))
                .body("'dis_change'", equalTo(true))
                .body("'duration'", numberMatches(0.0))
                .body("'dur_change'", equalTo(true));
        
    }
    
    
    @Test @Timeout(60)
    public void test_5() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("date_of_birth=lazy")
                .post(baseUrlOfSut + "/v1/users/update_birthday")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'username'", containsString("conghieu"))
                .body("'nick_name'", containsString("iwannatest"))
                .body("'avatar'", containsString("default.jpg"))
                .body("'hashed_password'", containsString("$2b$12$yI.ujN5OCcJ4TU5R7w8u9uTpwKBaZqxz8I79RzpY7d6b58NmQpiZq"))
                .body("'date_of_birth'", containsString("lazy"))
                .body("'create_date'", containsString("2023-03-03T04:47:54.275735"));
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_6() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'message'", containsString("Hi!"));
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_7() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("new_password=lazy")
                .post(baseUrlOfSut + "/v1/users/update_password")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'username'", containsString("conghieu"))
                .body("'nick_name'", containsString("idontknow"))
                .body("'avatar'", containsString("default.jpg"))
                .body("'hashed_password'", containsString("$2b$12$lQaVtvSPcEjts1qCCp/wKe6ZnDg2VR0I9gmjEaJB3dowKe55Vm2ZG"))
                .body("'date_of_birth'", containsString("aggressive"))
                .body("'create_date'", containsString("2023-03-03T04:47:54.275735"));
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_8() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .post(baseUrlOfSut + "/v1/users/avatar")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body(containsString("\"/resources/users/default.jpg\""));
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_9() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "/users/%25$%5E7fail")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'message'", containsString("Hello %$^7fail"));
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_10() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .get(baseUrlOfSut + "/users/lazy")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'message'", containsString("Hello lazy"));
        
        expectationHandler.expect(ems);
        
        given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "/v1/auth/me")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'username'", containsString("conghieu"))
                .body("'nick_name'", containsString("hieucong"))
                .body("'date_of_birth'", containsString("&&omg&7fadjs"))
                .body("'create_at'", containsString("2023-03-03T04:47:54.275735"))
                .body("'avatar'", containsString("default.jpg"));
        
    }
    
    
    @Test @Timeout(60)
    public void test_11() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "/v1/notification?user_id=646")
                .then()
                .statusCode(307)
                .assertThat()
                .body(isEmptyOrNullString());
        
        expectationHandler.expect(ems)
            /*
             Note: No supported codes appear to be defined. https://swagger.io/docs/specification/describing-responses/.
             This is somewhat unexpected, so the code below is likely to lead to a failed expectation
            */
            .that(sco, Arrays.asList().contains(res_0.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_12() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/json")
                .body(" { " + 
                    " \"username\": \"adventurous\", " + 
                    " \"nick_name\": \"mytest\", " + 
                    " \"date_of_birth\": \"teststring\", " + 
                    " \"avatar\": \"!abc@#$%\", " + 
                    " \"password\": \"EVOMASTER\" " + 
                    " } ")
                .post(baseUrlOfSut + "/v1/users")
                .then()
                .statusCode(307)
                .assertThat()
                .body(isEmptyOrNullString());
        
        expectationHandler.expect(ems)
            /*
             Note: No supported codes appear to be defined. https://swagger.io/docs/specification/describing-responses/.
             This is somewhat unexpected, so the code below is likely to lead to a failed expectation
            */
            .that(sco, Arrays.asList().contains(res_0.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_13() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("*/*")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "/v1/users?limit=648")
                .then()
                .statusCode(307)
                .assertThat()
                .body(isEmptyOrNullString());
        
        expectationHandler.expect(ems)
            /*
             Note: No supported codes appear to be defined. https://swagger.io/docs/specification/describing-responses/.
             This is somewhat unexpected, so the code below is likely to lead to a failed expectation
            */
            .that(sco, Arrays.asList().contains(res_0.extract().statusCode()));
    }


}