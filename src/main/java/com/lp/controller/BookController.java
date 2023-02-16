package com.lp.controller;

import com.lp.pojo.Books;
import com.lp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.GenericServlet;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
//    调用service
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
//    private Books books;

//    查询全部书籍
    @RequestMapping("/allBook")
    public String listBook(Model model){
        List<Books> booksList = bookService.queryAllBooks();

        model.addAttribute("list",booksList);
        return "bookList";
    }
//    跳转增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPage(){
//        System.out.println("add");
        return "addBook";
    }
//    增加书籍
    @RequestMapping("/addBook")
    public String addBook(Books books){
//        System.out.println(books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/toUpdatePage")
    public String toUpdatePage(int id,Model model){
        Books book = bookService.queryBookById(id);//查出要修改的行
//        System.out.println(book);
        model.addAttribute("qBook",book);
        return "updateBook";
    }
//    修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println(books);
        int i = bookService.updateBook(books);//修改一本书
        System.out.println("i="+i);
        return "redirect:/book/allBook";//重定向
    }
//    删除book
    @RequestMapping("/delBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBook(id);
        return "redirect:/book/allBook";
    }
//    查询书籍
    @RequestMapping("/searchBook")
    public String searchBook(String bookName,Model model){
        System.out.println("name="+bookName);
        Books books = bookService.searchBook(bookName);
        System.out.println("book"+books);
        if (books == null){
            model.addAttribute("msg","未查到");
            return "bookList";
        }
        ArrayList<Books> list = new ArrayList<>();
        list.add(books);
        System.out.println(list);
        model.addAttribute("list",list);
        return "bookList";
    }
}

