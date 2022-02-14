package com.codestates.seb.spring_airline_server.Controller;

import com.codestates.seb.spring_airline_server.Data.FlightData;
import com.codestates.seb.spring_airline_server.Domain.FilghtDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FlightControllerImpl implements FlightController {

    @Override
    @GetMapping("flight")
    public List<FilghtDTO.Info> FilterFlightList(@RequestParam(required = false) String departure_times,
                                                 @RequestParam(required = false) String arrival_times,
                                                 @RequestParam(required = false) String departure,
                                                 @RequestParam(required = false) String destination){

        if(departure_times != null && arrival_times != null){
            return FlightData.getInstacne().getFlightList()
                    .stream()
                    .filter(item -> item.getDeparture_times().equals(departure_times))
                    .filter(item -> item.getArrival_times().equals(arrival_times))
                    .collect(Collectors.toList());
        }
        else if(departure != null && destination != null){
            return FlightData.getInstacne().getFlightList()
                    .stream()
                    .filter(item -> item.getDeparture().equals(departure))
                    .filter(item -> item.getDestination().equals(destination))
                    .collect(Collectors.toList());
        }
        else{
            return FlightData.getInstacne().getFlightList();
        }
    }

    @Override
    @GetMapping("/flight/{id}")
    public FilghtDTO.Info FindById(@PathVariable(required = true) String id){
        return FlightData.getInstacne().getFlightList().stream()
                .filter(item -> item.getUuid().equals(id))
                .findFirst()
                .get();
    }

    @Override
    @PutMapping("/flight/{id}")
    public FilghtDTO.Info UpdateFlightData(@PathVariable(required = true) String id, @RequestBody(required = false) FilghtDTO.Request data){

        try{
            FilghtDTO.Info filterData = FlightData.getInstacne().getFlightList().stream()
                    .filter(item -> item.getUuid().equals(id))
                    .findAny()
                    .get();

            if(data.getDeparture() != null)filterData.setDeparture(data.getDeparture());
            if(data.getDestination() != null)filterData.setDestination(data.getDestination());
            if(data.getDeparture_times() != null)filterData.setDeparture_times(data.getDeparture_times());
            if(data.getArrival_times() != null)filterData.setArrival_times(data.getArrival_times());

            return filterData;

        }catch (Exception e){
            System.out.println("error :" + e);
            return null;
        }
    }
}
