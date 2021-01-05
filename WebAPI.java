package API;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

import static io.restassured.config.EncoderConfig.encoderConfig;
import static io.restassured.RestAssured.given;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class WebAPI {
    //token
    static String token = "s_AMjtE9-vQAAAAAAAAAAd3wJ0d5kpWcv-KZyGJhmqdSJ2n1jxibkDRgCVsql_iS";

    @Order(1)
    @Test
    public void upload_test() {
        RestAssured.config = RestAssured.config().encoderConfig(encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false));
        File a = new File("photo.jpg");
        String apiArgs = "{\"mode\":\"add\",\"autorename\":true,\"mute\":false,\"path\":\"/photo.jpg\"}";

        given().headers("Authorization","Bearer " + token, "Content-Type", "application/octet-stream", "Dropbox-API-Arg", apiArgs).body(a)
                .when().post("https://content.dropboxapi.com/2/files/upload")
                .then().statusCode(200);
    }

    @Order(2)
    @Test
    public void get_metadata_test() {
        Map<String,String> path = new HashMap<>();
        path.put("path", "/photo.jpg");

        given().headers("Authorization","Bearer " + token, "Content-Type", "application/json").body(path)
                .when().post("https://api.dropboxapi.com/2/files/get_metadata")
                .then().statusCode(200);
    }

    @Order(3)
    @Test
    public void delete_test() {
        Map<String,String> path = new HashMap<>();
        path.put("path", "/photo.jpg");

        given().headers("Authorization","Bearer " + token, "Content-Type", "application/json").body(path)
                .when().post("https://api.dropboxapi.com/2/files/delete_v2")
                .then().statusCode(200);
    }
}
