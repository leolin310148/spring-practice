package org.noteverything.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by leolin on 2014/1/5.
 */
@Configuration
public class AppConfig {

    @Bean
    public Book book() {
        Book book = new Book();
        book.setBookName("This is a book!");
        return book;
    }

    @Bean
    public Book book2() {
        Book book = new Book();
        book.setBookName("This is book 2!");
        return book;
    }
}
