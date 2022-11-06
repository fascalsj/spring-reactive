package com.belajar.reactive;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.Date;

@Repository
public interface PersonRepository extends ReactiveCrudRepository<Person, String> {
    Flux<Person> findByComingDateBetween(Date startDate, Date endDate);
    Flux<Person> findByComingDateBetweenOrderByComingDateDesc(Date startDate, Date endDate);
}
