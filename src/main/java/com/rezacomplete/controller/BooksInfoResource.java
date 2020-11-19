package com.rezacomplete.controller;


import com.rezacomplete.model.BookInfo;
import com.rezacomplete.service.BooksInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BooksInfoResource {

    @Autowired
    private BooksInfoService booksInfoService;

    @RequestMapping(path = "/books/{bookId}", method = RequestMethod.GET)
    public BookInfo retrieveBookInfo(@PathVariable String bookId) {

        //todo some input validations here ...
        return booksInfoService.retrieveBookInfo(bookId);
    }

    @PostMapping(path="add")
    public @ResponseBody String add(@RequestParam String id, @RequestParam String name) {
        booksInfoService.addBookInfo(id, name);
        return "Saved";
    }
}
