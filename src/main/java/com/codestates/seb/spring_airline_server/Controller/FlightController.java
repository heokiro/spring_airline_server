package com.codestates.seb.spring_airline_server.Controller;

import com.codestates.seb.spring_airline_server.Domain.FilghtDTO;

import java.util.List;

public interface FlightController {
    List<FilghtDTO.Info> FilterFlightList(String departure_times, String arrival_times, String departure, String destination);
    FilghtDTO.Info FindById(String id);
    FilghtDTO.Info UpdateFlightData(String id, FilghtDTO.Request data);
}