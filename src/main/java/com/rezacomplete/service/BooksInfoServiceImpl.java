package com.rezacomplete.service;

import com.rezacomplete.model.BookInfo;
import com.rezacomplete.repository.BooksInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksInfoServiceImpl implements BooksInfoService {

    @Autowired
    private BooksInfoRepository booksInfoRepository;

    @Override
    public BookInfo retrieveBookInfo(String bookId) {
        return booksInfoRepository.findByBookId(bookId);
    }
}
