package com.belajar.reactive;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class PersonDto {
    String id;
    String username;
    String firstname;
    String lastname;
    Date comingDate;
}
