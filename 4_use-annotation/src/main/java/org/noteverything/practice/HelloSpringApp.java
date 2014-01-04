package org.noteverything.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by leolin on 2014/1/4.
 */
public class HelloSpringApp {

    //不使用xml設定檔 使用Annotation來設定Spring環境
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //此處的book對應到AppConfig的book()
        Book book = (Book) applicationContext.getBean("book");
        System.out.println(book.getBookName());

        //此處的book2對應到AppConfig的book2()
        Book anotherBook = (Book) applicationContext.getBean("book2");
        System.out.println(anotherBook.getBookName());
    }
}
