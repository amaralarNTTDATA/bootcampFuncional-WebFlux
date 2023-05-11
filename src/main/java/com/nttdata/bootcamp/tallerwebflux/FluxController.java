package com.nttdata.bootcamp.tallerwebflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class FluxController {

    @GetMapping(value = "/numbers", produces = "text/event-stream")
    public Flux<Integer> numbers() {

        return Flux.range(1, 30).delayElements(Duration.ofSeconds(1));

    }



}
