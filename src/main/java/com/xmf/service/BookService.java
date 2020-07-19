package com.xmf.service;

import com.xmf.pojo.Books;

import java.util.List;

public interface BookService {

    int addBook(Books book);

    int deleteBookById(int bookId);

    int updateBook(Books book);

    Books queryBookById(int bookId);

    List<Books> queryAllBook();
}
