package com.xmf.dao;

import com.xmf.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {

    int addBook(Books book);

    int deleteBookById(int bookId);

    int updateBook(Books book);

    Books queryBookById(int bookId);

    List<Books> queryAllBook();

    Books queryBookByName(@Param("bookName") String bookName);
}
