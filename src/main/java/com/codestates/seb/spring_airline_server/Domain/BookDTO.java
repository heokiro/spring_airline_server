package com.codestates.seb.spring_airline_server.Domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {
    private String flight_uuid;
    private String name;
    private String phone;
}
