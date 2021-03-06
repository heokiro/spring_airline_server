package com.codestates.seb.spring_airline_server.Data;

import com.codestates.seb.spring_airline_server.Domain.FilghtDTO;

import java.util.ArrayList;

public class FlightData {
    private static final FlightData instacne = new FlightData();
    private ArrayList<FilghtDTO.Info> FlightList = new ArrayList<>();

    public static FlightData getInstacne() {
        return instacne;
    }

    public ArrayList<FilghtDTO.Info> getFlightList() {
        return FlightList;
    }

    private FlightData(){
        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40byd")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());


        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba48bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdbr40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fd7a40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40bod")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba44bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba42bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba41bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba99bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba50bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());
    }

    public void Reset(){
        FlightList.clear();
        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40byd")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());


        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba48bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdbr40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fd7a40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40bod")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba44bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba42bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba41bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba99bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FilghtDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba50bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());
    }
}

