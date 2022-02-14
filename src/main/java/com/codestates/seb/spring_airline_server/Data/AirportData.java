package com.codestates.seb.spring_airline_server.Data;

import com.codestates.seb.spring_airline_server.Domain.AirportDTO;

import java.util.ArrayList;

public class AirportData {
    private final static AirportData instance = new AirportData();
    public ArrayList<AirportDTO> AirportList = new ArrayList<>();

    public static AirportData getInstance() {return instance;}

    private AirportData(){
        AirportList.add(AirportDTO.builder()
                .name("제주")
                .code("CJU")
                .build());

        AirportList.add(AirportDTO.builder()
                .name("인천")
                .code("ICN")
                .build());

        AirportList.add(AirportDTO.builder()
                .name("부산")
                .code("PUS")
                .build());

        AirportList.add(AirportDTO.builder()
                .name("광주")
                .code("KWJ")
                .build());

        AirportList.add(AirportDTO.builder()
                .name("방콕")
                .code("BKK")
                .build());

    }

}
