package org.noteverything.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leolin on 2014/1/4.
 */
public class HelloSpringApp {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Book book = (Book) applicationContext.getBean("book");
        System.out.println(book.getBookName());
    }


}
