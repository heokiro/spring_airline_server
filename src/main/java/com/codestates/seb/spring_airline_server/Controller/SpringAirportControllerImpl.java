package com.codestates.seb.spring_airline_server.Controller;

import com.codestates.seb.spring_airline_server.Data.AirportData;
import com.codestates.seb.spring_airline_server.Domain.AirportDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@RestController
public class SpringAirportControllerImpl implements SpringAirportController {

    @Override
    @GetMapping("airport")
    public List<AirportDTO> AirportFindByKeyWord(@RequestParam(required = true) String query) {
        return AirportData.getInstance().AirportList
                .stream()
                .filter(data -> data.getCode().contains(query.toUpperCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }

}


