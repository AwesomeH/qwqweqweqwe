package com.time.service;

import com.time.pojo.Books;

import java.util.List;

public interface BookService {

    /*
    * 我们都知道，标准主流现在的编程方式都是采用MVC综合设计模式，MVC本身不属于设计模式的一种，
    * 它描述的是一种结构，最终目的达到解耦，解耦说的意思是你更改某一层代码，不会影响我其他层代码，
    * 如果你会像spring这样的框架，你会了解面向接口编程，表示层调用控制层，控制层调用业务层，业务层调用数据访问层。
    * 初期也许都是new对象去调用下一层，比如你在业务层new一个DAO类的对象，调用DAO类方法访问数据库，
    * 这样写是不对的，因为在业务层中是不应该含有具体对象，最多只能有引用，如果有具体对象存在，就耦合了。
    *
    * spring的依赖注入可以得到dao的对象,spring本身做的就是用来解耦
    *
    *
    * 当那个对象不存在，我还要修改业务的代码，这不符合逻辑。好比主板上内存坏了，我换内存，没必要连主板一起换。
    * 我不用知道内存是哪家生产，不用知道多大容量，只要是内存都可以插上这个接口使用。这就是MVC的意义。
    * 接下来说你感觉service的意义，其实因为你现在做东西分层次不是那么严格，在一个你们做东西业务本身也少，
    * 举个最简单的例子，你做一个分页的功能，数据1000条，你20条在一个页，你可以把这个功能写成工具类封装起来
    * 然后在业务层里调用这个封装的方法，这才是业务里真正干得事，只要没访问数据库的，都要在业务里写。
     只是刚开始写的代码都是有个请求，我就去数据库取，业务几乎没有。*/


    //BookService:底下需要去实现,调用dao层

    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();
}

