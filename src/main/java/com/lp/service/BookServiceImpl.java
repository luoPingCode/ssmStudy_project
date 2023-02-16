package com.lp.service;

import com.lp.dao.BookMapper;
import com.lp.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {
    //    service调用dao
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    public int updateBook(Books books) {
        System.out.println("service="+books);
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    public Books searchBook(String name){
        return bookMapper.searchBook(name);
    }
}
