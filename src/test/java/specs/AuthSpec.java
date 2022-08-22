package specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class AuthSpec {
    public static RequestSpecification authRequestSpec = with()
            .basePath("mitsubishi/outlander/")
            .log().body()
            .log().all()
            .accept("text/html")
            .queryParam("transmission[]", "2")
            .queryParam("transmission[]", "5");
    public static ResponseSpecification getAuthResponseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.BODY)
            .log(LogDetail.STATUS)
            .build();
}

