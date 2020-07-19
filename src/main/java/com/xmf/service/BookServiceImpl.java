package com.xmf.service;

import com.xmf.dao.BookMapper;
import com.xmf.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper bookMapper;

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int bookId) {
        return bookMapper.deleteBookById(bookId);
    }

    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    public Books queryBookById(int bookId) {
        return bookMapper.queryBookById(bookId);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
