package controller;

import Service.BookService;
import domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@RestController=@Controller+  @ResponseBody
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("json")
    @ResponseBody  //也可以直接写到类上

    public Book findByid(int id){
        Book findbyid = bookService.findbyid(id);
        return findbyid;
    }
}
