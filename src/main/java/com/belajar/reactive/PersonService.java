package com.belajar.reactive;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    Mono<Person> getPersonById(String id) {
        return personRepository.findById(id);
    }

    Flux<PersonDto> getByBetweenDate() {
        Date newDate = new Date();
        return personRepository.findByComingDateBetween(newDate, newDate).flatMap(person ->
             Flux.just(personMapper.personToPersonDto(person))
        );
    }

    Flux<Person> getByBetweenDateOrderDesc() {
        Date newDate = new Date();
        return personRepository.findByComingDateBetweenOrderByComingDateDesc(newDate, newDate);
    }
}
