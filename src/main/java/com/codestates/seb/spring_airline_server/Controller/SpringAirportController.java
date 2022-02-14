package com.codestates.seb.spring_airline_server.Controller;

import com.codestates.seb.spring_airline_server.Domain.AirportDTO;

import java.util.List;

public interface SpringAirportController {
    List<AirportDTO> AirportFindByKeyWord(String query);
}

