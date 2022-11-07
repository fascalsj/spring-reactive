package com.belajar.reactive;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping
    public Mono<Person> getPerson() {
        return personService.getPersonById("A");
    }

    @GetMapping("/between")
    public Flux<PersonDto> getPersonByDuration() {
        return personService.getByBetweenDate();
    }


    @GetMapping("/between-order")
    public Flux<Person> getPersonByDurationOrderDesc() {
        return personService.getByBetweenDateOrderDesc();
    }
}
