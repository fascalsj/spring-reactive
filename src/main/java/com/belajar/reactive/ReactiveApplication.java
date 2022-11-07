package com.belajar.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class ReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApplication.class, args);
		Flux.just(1,2,3,4,5,6,7,8).flatMap(x->{
			System.out.println();
			return Flux.just(x);
		}).log().subscribe();
	}

}
