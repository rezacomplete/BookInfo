package com.rezacomplete.repository;

import com.rezacomplete.model.BookInfo;
import org.springframework.stereotype.Component;

@Component
public class BooksInfoRepository {

    public BookInfo findByBookId(String bookId) {

        //todo should get these values from a database
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookId(bookId);
        bookInfo.setName("book" + bookId);

        return bookInfo;
    }
}
