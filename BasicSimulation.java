import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;


public class BasicSimulation extends Simulation {
    HttpProtocolBuilder httpProtocol = 
    http.baseUrl("https://klm.com")
    .acceptHeader("application/json")
    .userAgentHeader(
        "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
    )
}