package com.belajar.reactive;

import org.mapstruct.Mapper;
import reactor.core.publisher.Flux;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonDto personToPersonDto(Person person);
}
