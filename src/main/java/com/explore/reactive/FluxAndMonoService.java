package com.explore.reactive;

import java.util.Arrays;
import reactor.core.publisher.Flux;

public class FluxAndMonoService {

  public static void main(String[] args) {
    FluxAndMonoService fluxAndMonoService = new FluxAndMonoService();
    fluxAndMonoService.techStack()
        .subscribe(tech -> {
          System.out.println(tech);
        });
  }

  public Flux<String> techStack() {
    return Flux.fromIterable(Arrays.asList("SpringBoot", "SpringData", "SpringWebFlux"));
  }
}
