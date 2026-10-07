import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

import scala.concurrent.duration._

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
 


public class BasicSimulation extends Simulation {
    HttpProtocolBuilder httpProtocol = 
    http.baseUrl("https://test.com")
    .acceptHeader("application/json")
    .userAgentHeader(
        "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
    )

ScenarioBuilder scenario = 

}