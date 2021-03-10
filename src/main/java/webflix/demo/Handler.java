package webflix.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;

import static reactor.core.publisher.Mono.just;

@Component
public class Handler {


    public Mono<ServerResponse> EngToKor(ServerRequest request){


        String str = request.queryParam("input").get();
        Mono<String> EngToKorMono = Mono.just(new EngToKor().EngToKorAct(str)).map(n ->{
            HashMap<String,String> result = new HashMap<>();
            result.put("assembly",n);
            String resultStr = null;
            try {
                resultStr = new ObjectMapper().writeValueAsString(result);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return resultStr;
        });
        return ServerResponse.ok()
                .body(EngToKorMono,String.class);
    }
}
