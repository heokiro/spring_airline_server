package com.codestates.seb.spring_airline_server.Data;

import com.codestates.seb.spring_airline_server.Domain.BookDTO;

import java.util.ArrayList;

public class BookData {
    private static final BookData instance = new BookData();
    private ArrayList<BookDTO> BookList = new ArrayList<>();

    public static BookData getInstance() {
        return instance;
    }

    public ArrayList<BookDTO> getBookList() {
        return BookList;
    }

    private BookData(){
    }
}
