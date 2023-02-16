package com.lp.dao;

import com.lp.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
//    增加一本书
    int addBook(Books books);
//    删除一本书
    int deleteBook(@Param("bookId") int id);
//    修改一本书
    int updateBook(Books books);
//    查询一本书
    Books queryBookById(@Param("bookId") int id);
//    查询全部书
    List<Books> queryAllBooks();
//    搜索书
    Books searchBook(@Param("bookName") String bookName);
}

