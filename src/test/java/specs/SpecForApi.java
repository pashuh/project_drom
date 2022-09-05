package specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class SpecForApi {
    public static RequestSpecification searchFroParamRequestSpec = with()
            .basePath("mitsubishi/outlander/")
            .log().body()
            .log().all()
            .accept("text/html")
            .queryParam("transmission[]", "2")
            .queryParam("transmission[]", "5");
    public static ResponseSpecification getSearchFroParamResponseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.BODY)
            .log(LogDetail.STATUS)
            .build();

    public static RequestSpecification searchFordRequestSpec = with()
            .log().body()
            .log().all()
            .accept("text/html")
            .queryParam("privod", "1");
    public static ResponseSpecification getSearchFordResponseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.BODY)
            .log(LogDetail.STATUS)
            .build();

    public static RequestSpecification automaticTransmissionRequestSpec = with()
            .log().body()
            .log().all()
            .accept("text/html")
            .queryParam("transmission[]", "1");
    public static ResponseSpecification getautomaticTransmissionResponseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.BODY)
            .log(LogDetail.STATUS)
            .build();

    public static RequestSpecification favoriteRequestSpec = with()
            .log().body()
            .log().all()
            .accept("text/html");
    public static ResponseSpecification getFavoriteResponseSpec = new ResponseSpecBuilder()
            .expectStatusCode(404)
            .log(LogDetail.BODY)
            .log(LogDetail.STATUS)
            .build();

    public static RequestSpecification catalogRequestSpec = with()
            .log().body()
            .log().all()
            .accept("text/html");
    public static ResponseSpecification getCatalogResponseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.BODY)
            .log(LogDetail.STATUS)
            .build();
}