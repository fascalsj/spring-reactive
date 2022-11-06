package com.belajar.reactive;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Setter
@Getter
public class Person {
    @Id
    String id;
    String username;
    String firstname;
    String lastname;
    Date comingDate;
}
