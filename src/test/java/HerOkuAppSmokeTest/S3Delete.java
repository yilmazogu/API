package HerOkuAppSmokeTest;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static util.AuthenticationHerOkuApp.generateToken;

public class S3Delete extends HerOkuAppBaseUrl {
    /*
    Given
        https://restful-booker.herokuapp.com/booking/429
    When
        Send delete request
    Then
        Status code should be 201
    And
        Body should be "Created"
     */
    @Test
    public void delete01(){
        //Set the url
        spec.pathParams("first","booking","second",4860);

        //Set the expected data
        String expectedData = "Created";

        //Send the request and get the response
        Response response = given().spec(spec).when().delete("/{first}/{second}");

        response.prettyPrint();





    }



}