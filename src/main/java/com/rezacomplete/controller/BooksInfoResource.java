package com.rezacomplete.controller;


import com.rezacomplete.model.BookInfo;
import com.rezacomplete.service.BooksInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksInfoResource {

    @Autowired
    private BooksInfoService booksInfoService;

    @RequestMapping(path = "/books/{bookId}", method = RequestMethod.GET)
    public BookInfo retrieveBookInfo(@PathVariable String bookId) {

        //todo some input validations here ...
        return booksInfoService.retrieveBookInfo(bookId);
    }
}
