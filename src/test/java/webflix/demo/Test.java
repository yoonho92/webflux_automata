package webflix.demo;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {

    @org.junit.jupiter.api.Test
    public void createAFlux_just(){
//        Stream<String> fruitStream = Stream.of("Apple","Orange","Grape","Banana","Strawberry");
//        Flux<String> fruitFlux = Flux.fromStream(fruitStream);

//        Flux<String> characterFlux = Flux.just("Garfied","Kojak","Barbossa");
//        Flux<String> foodFlux = Flux.just("Lasagna","Lollipops","Apples");
//
//        Flux<String> zippedFlux = Flux.zip(characterFlux,foodFlux, (c,f) -> c+ " eats "+f);
//
//        StepVerifier.create(zippedFlux)
//                .expectNext("Garfied eats Lasagna")
//                .expectNext("Kojak eats Lollipops")
//                .expectNext("Barbossa eats Apples")
//                .verifyComplete();


//        Flux<String> slowFlux = Flux.just("tortoise","snail","sloth")
//                .delaySubscription(Duration.ofMillis(100));
//        Flux<String> fastFlux = Flux.just("hare", "cheetah","squirrel");
//        Flux<String> firstFlux = Flux.firstWithSignal(slowFlux,fastFlux);
//
//        StepVerifier.create(firstFlux)
//                .expectNext("hare")
//                .expectNext("cheetah")
//                .expectNext("squirrel")
//                .verifyComplete();

//        Flux<String> nationalParkFlux = Flux.just(
//                "Yellowstone","Yosemite","Grand Canyon", "Zion", "Grand Teton")
//                .filter(np -> !np.contains(" "));
//        StepVerifier.create(nationalParkFlux)
//                .expectNext("Yellowstone","Yosemite","Zion")
//                .verifyComplete();

//        Flux<String> animalFlux = Flux.just(
//                "dog","cat","bird","dog","bird","anteater")
//                .distinct();
//        StepVerifier.create(animalFlux)
//                .expectNext("dog")
//                .expectNext("cat")
//                .expectNext("bird")
//                .expectNext("anteater")
//                .verifyComplete();







    }
}
