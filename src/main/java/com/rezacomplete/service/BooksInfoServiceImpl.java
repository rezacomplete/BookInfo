package com.rezacomplete.service;

import com.rezacomplete.entity.Book;
import com.rezacomplete.model.BookInfo;
import com.rezacomplete.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BooksInfoServiceImpl implements BooksInfoService {

    @Autowired
    private BooksRepository booksRepository;

    @Override
    public BookInfo retrieveBookInfo(String bookId) {
        Optional<Book> book = booksRepository.findById(bookId);
        if (book.isPresent()) {
            BookInfo bookInfo = new BookInfo();
            bookInfo.setBookId(book.get().getId());
            bookInfo.setName(book.get().getName());
            return bookInfo;
        }

        return null;
    }

    @Override
    public void addBookInfo(String id, String name) {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        booksRepository.save(book);
    }
}
