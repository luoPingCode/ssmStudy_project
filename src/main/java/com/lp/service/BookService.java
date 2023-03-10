package com.lp.service;

import com.lp.pojo.Books;


import java.util.List;

public interface BookService {
    //    增加一本书
    int addBook(Books books);
    //    删除一本书
    int deleteBook(int id);
    //    修改一本书
    int updateBook(Books books);
    //    查询一本书
    Books queryBookById(int id);
    //    查询全部书
    List<Books> queryAllBooks();

    Books searchBook(String name);
}
