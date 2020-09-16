package com.rezacomplete.service;

import com.rezacomplete.model.BookInfo;

public interface BooksInfoService {
    BookInfo retrieveBookInfo(String bookId);
}
