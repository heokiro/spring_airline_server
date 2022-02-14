package com.codestates.seb.spring_airline_server.Controller;

import com.codestates.seb.spring_airline_server.Domain.BookDTO;

import java.util.List;

public interface BookController {
    List<BookDTO> FindBook(String flight_uuid, String phone);
    BookDTO CreateBook(BookDTO createData);
    List<BookDTO> DeleteByPhone(String phone);
}
