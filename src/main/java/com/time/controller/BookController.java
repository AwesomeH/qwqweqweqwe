package com.time.controller;


import com.time.pojo.Books;
import com.time.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/*
* 1 @Controller

@Controller注解在类上，表明这个类是Spring MVC里的Controller，将其声明为Spring的一个Bean，
* Dispatch Servlet会自动扫描注解了此注解的类，并将Web请求映射到注解了@RequestMapping的方法上，
* 需要注意的是，在Spring MVC声明控制器Bean的时候，只能使用@Controller。

2 @RequestMapping

@RequestMapping注解是用来映射Web请求（访问路径和参数）、处理类和方法的。
* 它可以注解在类和方法上。注解在方法上的@RequestMapping路径会继承注解在类上的路径，
* @RequestMapping支持Servlet的request和response作为参数，也支持对它们的媒体类型进行配置。*/
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }






}
