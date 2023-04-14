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
 * This file was automatically generated by EvoMaster on 2023-04-07T16:37:22.399502Z[GMT]
 * <br>
 * The generated test suite contains 17 tests
 * <br>
 * Covered targets: 46
 * <br>
 * Used time: 1h 0m 0s
 * <br>
 * Needed budget for current results: 99%
 * <br>
 * This file contains test cases that represent failed calls, but not indicative of faults.
 */
public class EvoMaster_others_Test {

    
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
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .contentType("application/x-www-form-urlencoded")
                .body("distance=0.38130899237271476&duration=0.5752666408176695&record_date=%26%26omg%267fadjs&image_file=%5BB%405232e3f1")
                .post(baseUrlOfSut + "/v1/records/upload")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Not authenticated"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_0.extract().statusCode()));
        
        given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "/v1/records/my_records")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
        
        
        ValidatableResponse res_2 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("new_password=testsucess242")
                .post(baseUrlOfSut + "/v1/users/update_password")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'username'", containsString("conghieu"))
                .body("'nick_name'", containsString("idontknow"))
                .body("'avatar'", containsString("default.jpg"))
                .body("'hashed_password'", containsString("$2b$12$qgdJVhrQeS64wlz.CrPenecywGGSNKNkM4pBZORb4z5muLfvVpQD2"))
                .body("'date_of_birth'", containsString("aggressive"))
                .body("'create_date'", containsString("2023-03-03T04:47:54.275735"));
        
        expectationHandler.expect(ems);
    }
    
    
    @Test @Timeout(60)
    public void test_1() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("nick_name=myfirstblog")
                .post(baseUrlOfSut + "/v1/users/update_nickname")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'username'", containsString("conghieu"))
                .body("'nick_name'", containsString("myfirstblog"))
                .body("'avatar'", containsString("default.jpg"))
                .body("'hashed_password'", containsString("$2b$12$hE5eJaFQsxFMVsoVoXwaMOjkrtVuPBCIKgLxsdfuvuthn2suKzuey"))
                .body("'date_of_birth'", containsString("testsucess242"))
                .body("'create_date'", containsString("2023-03-03T04:47:54.275735"));
        
        expectationHandler.expect(ems);
        
        ValidatableResponse res_1 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "/users/adventurous")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'message'", containsString("Hello adventurous"));
        
        expectationHandler.expect(ems);
        
        ValidatableResponse res_2 = given().accept("application/json")
                .contentType("application/x-www-form-urlencoded")
                .body("user_id=myfirstblog")
                .post(baseUrlOfSut + "/v1/records/get_records_by_user")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Not authenticated"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_2.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_2() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "/users/adventurous")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'message'", containsString("Hello adventurous"));
        
        expectationHandler.expect(ems);
        
        ValidatableResponse res_1 = given().accept("application/json")
                .contentType("application/x-www-form-urlencoded")
                .body("avatar=%5BB%404e22368c")
                .post(baseUrlOfSut + "/v1/users/update_avatar")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Not authenticated"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_1.extract().statusCode()));
        
        ValidatableResponse res_2 = given().accept("application/json")
                .contentType("application/x-www-form-urlencoded")
                .body("input_date=kemongmo_va_restler")
                .post(baseUrlOfSut + "/v1/ranking/month")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Not authenticated"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_2.extract().statusCode()));
        
        ValidatableResponse res_3 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("nick_name=EVOMASTER")
                .post(baseUrlOfSut + "/v1/users/update_nickname")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'username'", containsString("conghieu"))
                .body("'nick_name'", containsString("EVOMASTER"))
                .body("'avatar'", containsString("default.jpg"))
                .body("'hashed_password'", containsString("$2b$12$PqMqakGGTAaaFeY...8FRup8XiDeiHT8T8Xak3irt03UNHZ.495XG"))
                .body("'date_of_birth'", containsString("mytest"))
                .body("'create_date'", containsString("2023-03-03T04:47:54.275735"));
        
        expectationHandler.expect(ems);
        
        ValidatableResponse res_4 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("nick_name=mytest&date_of_birth=lazy&avatar=%5BB%4023468512")
                .put(baseUrlOfSut + "/v1/users/update_info")
                .then()
                .statusCode(422)
                .assertThat()
                .contentType("application/json")
                .body("'detail'.size()", equalTo(1))
                .body("'detail'[0].'loc'.size()", equalTo(2))
                .body("'detail'[0].'loc'", hasItems("body", "avatar"))
                .body("'detail'[0].'msg'", containsString("Expected UploadFile, received: <class 'str'>"))
                .body("'detail'[0].'type'", containsString("value_error"));
        
        expectationHandler.expect(ems)
            .that(rso, ((Map) res_4.extract().response().jsonPath().getJsonObject("")).keySet().containsAll(Arrays.asList()));
    }
    
    
    @Test @Timeout(60)
    public void test_3() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .get(baseUrlOfSut + "/v1/notification/type?date_input=2065-11-06T16%3A16%3A-1")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Not authenticated"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_0.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_4() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("username=restler&password=idontknow&scope=teststring&client_secret=%21abc%40%23%24%25")
                .post(baseUrlOfSut + "/v1/auth/token")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Could not validate credentials"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_0.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_5() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .post(baseUrlOfSut + "/v1/users/overview_user")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Not authenticated"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404).contains(res_0.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_6() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .get(baseUrlOfSut + "/v1/records/my_records_in_range?" + 
                    "start_date=2030-10-04T08%3A60%3A02&" + 
                    "end_date=1925-06-10T02%3A16%3A24")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Not authenticated"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_0.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_7() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .contentType("application/x-www-form-urlencoded")
                .body("file_name=teststring")
                .post(baseUrlOfSut + "/v1/records/evidence_by_name")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Not authenticated"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_0.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_8() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .contentType("application/x-www-form-urlencoded")
                .body("date_input=mytest")
                .post(baseUrlOfSut + "/v1/notification/user")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Not authenticated"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_0.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_9() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("avatar=%5BB%401376883")
                .post(baseUrlOfSut + "/v1/users/update_avatar")
                .then()
                .statusCode(422)
                .assertThat()
                .contentType("application/json")
                .body("'detail'.size()", equalTo(1))
                .body("'detail'[0].'loc'.size()", equalTo(2))
                .body("'detail'[0].'loc'", hasItems("body", "avatar"))
                .body("'detail'[0].'msg'", containsString("Expected UploadFile, received: <class 'str'>"))
                .body("'detail'[0].'type'", containsString("value_error"));
        
        expectationHandler.expect(ems)
            .that(rso, ((Map) res_0.extract().response().jsonPath().getJsonObject("")).keySet().containsAll(Arrays.asList()));
        
        ValidatableResponse res_1 = given().accept("application/json")
                .contentType("application/x-www-form-urlencoded")
                .body("nick_name=adventurous&date_of_birth=testmyapi&avatar=%5BB%407e8279e5")
                .put(baseUrlOfSut + "/v1/users/update_info")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Not authenticated"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_1.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_10() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("nick_name=%21abc%40%23%24%25&date_of_birth=EVOMASTER&avatar=%5BB%401859ffda")
                .put(baseUrlOfSut + "/v1/users/update_info")
                .then()
                .statusCode(422)
                .assertThat()
                .contentType("application/json")
                .body("'detail'.size()", equalTo(1))
                .body("'detail'[0].'loc'.size()", equalTo(2))
                .body("'detail'[0].'loc'", hasItems("body", "avatar"))
                .body("'detail'[0].'msg'", containsString("Expected UploadFile, received: <class 'str'>"))
                .body("'detail'[0].'type'", containsString("value_error"));
        
        expectationHandler.expect(ems)
            .that(rso, ((Map) res_0.extract().response().jsonPath().getJsonObject("")).keySet().containsAll(Arrays.asList()));
        
        ValidatableResponse res_1 = given().accept("application/json")
                .contentType("application/x-www-form-urlencoded")
                .body("nick_name=%21abc%40%23%24%25")
                .post(baseUrlOfSut + "/v1/users/update_nickname")
                .then()
                .statusCode(401)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("Not authenticated"));
        
        expectationHandler.expect(ems)
            .that(sco, Arrays.asList(200, 404, 422).contains(res_1.extract().statusCode()));
    }
    
    
    @Test @Timeout(60)
    public void test_11() throws Exception {
        
        given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("file_name=%21abc%40%23%24%25")
                .post(baseUrlOfSut + "/v1/records/evidence_by_name")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("File not found"));
        
    }
    
    
    @Test @Timeout(60)
    public void test_12() throws Exception {
        
        given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "/v1/users/918")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("User not found"));
        
    }
    
    
    @Test @Timeout(60)
    public void test_13() throws Exception {
        
        given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("nick_name=clueless")
                .post(baseUrlOfSut + "/v1/users/overview_user_by_nickname")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'detail'", containsString("User not found"));
        
    }
    
    
    @Test @Timeout(60)
    public void test_14() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("avatar=%5BB%40718fd7c1")
                .post(baseUrlOfSut + "/v1/users/update_avatar")
                .then()
                .statusCode(422)
                .assertThat()
                .contentType("application/json")
                .body("'detail'.size()", equalTo(1))
                .body("'detail'[0].'loc'.size()", equalTo(2))
                .body("'detail'[0].'loc'", hasItems("body", "avatar"))
                .body("'detail'[0].'msg'", containsString("Expected UploadFile, received: <class 'str'>"))
                .body("'detail'[0].'type'", containsString("value_error"));
        
        expectationHandler.expect(ems)
            .that(rso, ((Map) res_0.extract().response().jsonPath().getJsonObject("")).keySet().containsAll(Arrays.asList()));
    }
    
    
    @Test @Timeout(60)
    public void test_15() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .contentType("application/x-www-form-urlencoded")
                .body("distance=0.5286141552262397&duration=0.017067631581715093&record_date=adventurous&image_file=%5BB%4036bed37a")
                .post(baseUrlOfSut + "/v1/records/upload")
                .then()
                .statusCode(422)
                .assertThat()
                .contentType("application/json")
                .body("'detail'.size()", equalTo(1))
                .body("'detail'[0].'loc'.size()", equalTo(2))
                .body("'detail'[0].'loc'", hasItems("body", "image_file"))
                .body("'detail'[0].'msg'", containsString("Expected UploadFile, received: <class 'str'>"))
                .body("'detail'[0].'type'", containsString("value_error"));
        
        expectationHandler.expect(ems)
            .that(rso, ((Map) res_0.extract().response().jsonPath().getJsonObject("")).keySet().containsAll(Arrays.asList()));
    }
    
    
    @Test @Timeout(60)
    public void test_16() throws Exception {
        ExpectationHandler expectationHandler = expectationHandler();
        
        ValidatableResponse res_0 = given().accept("application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMzAiLCJleHAiOjE2ODA5Njc2ODl9.VYQWwY39X_UV4FU7TTvO4f2ZpfX_kB2XzvNBHAD23cA") // Fixed Headers
                .get(baseUrlOfSut + "/v1/records/my_records_in_range?" + 
                    "start_date=2045-13-28T01%3A55%3A52&" + 
                    "end_date=1905-06-17T13%3A01%3A59")
                .then()
                .statusCode(422)
                .assertThat()
                .contentType("application/json")
                .body("'detail'.size()", equalTo(1))
                .body("'detail'[0].'loc'.size()", equalTo(2))
                .body("'detail'[0].'loc'", hasItems("query", "start_date"))
                .body("'detail'[0].'msg'", containsString("invalid datetime format"))
                .body("'detail'[0].'type'", containsString("value_error.datetime"));
        
        expectationHandler.expect(ems)
            .that(rso, ((Map) res_0.extract().response().jsonPath().getJsonObject("")).keySet().containsAll(Arrays.asList()));
    }


}