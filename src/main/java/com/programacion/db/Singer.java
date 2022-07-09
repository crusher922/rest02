package com.programacion.db;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Singer {
    @Getter @Setter private Integer id;
    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;
    @Getter @Setter private String birthDate;
}
