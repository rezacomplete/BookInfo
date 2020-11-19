package com.rezacomplete.repository;

import com.rezacomplete.entity.Book;
import com.rezacomplete.model.BookInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends CrudRepository<Book, String> {
}
