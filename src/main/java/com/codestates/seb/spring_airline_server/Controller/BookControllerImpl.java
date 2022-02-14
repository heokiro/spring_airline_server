package com.codestates.seb.spring_airline_server.Controller;

import com.codestates.seb.spring_airline_server.Data.BookData;
import com.codestates.seb.spring_airline_server.Domain.BookDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookControllerImpl implements BookController{

    @Override
    @GetMapping("book")
    public List<BookDTO> FindBook(@RequestParam(required = false) String flight_uuid,
                                  @RequestParam(required = false) String phone){
        if(flight_uuid != null){
            return BookData.getInstance().getBookList().stream()
                    .filter(item -> item.getFlight_uuid().equals(flight_uuid))
                    .collect(Collectors.toList());
        }

        if(phone != null){
            return BookData.getInstance().getBookList().stream()
                    .filter(item -> item.getPhone().equals(phone))
                    .collect(Collectors.toList());
        }

        return BookData.getInstance().getBookList();
    }

    @Override
    @PostMapping("book")
    public BookDTO CreateBook(@RequestBody(required = true) BookDTO createData) {
        try{
            BookData.getInstance().getBookList().add(createData);
            return BookData.getInstance().getBookList().get(BookData.getInstance().getBookList().size()-1);

        }catch(Exception e){
            System.out.println("error : " + e);
            return null;
        }
    }

    @Override
    @DeleteMapping("book")
    public List<BookDTO> DeleteByPhone(@RequestParam(required = true) String phone){
        try{
            return BookData.getInstance().getBookList().stream()
                    .filter(item -> !item.getPhone().equals(phone))
                    .collect(Collectors.toList());

        }catch(Exception e){
            return null;
        }
    }
}
