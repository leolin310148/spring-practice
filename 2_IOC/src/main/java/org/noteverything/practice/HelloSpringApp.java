package org.noteverything.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leolin on 2014/1/4.
 */
public class HelloSpringApp {

    //IOC Type 0
    //由需要的使用Book物件的環境來自行創建物件，管理物件
    //A book create in the main method and the application has to control the Book Object.
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("A Book from IOC Type 0");
        System.out.println(book.getBookName());
    }

    //IOC Type2 & 3
    //Type2為透過setter爲物件設定屬性
    //Type3為透過建構子（constructor）為物件設定屬性
    //物件的創建與管理交給Spring
    //程式只需關注 "一本書" 的實作
    //Use SpringFramework to create and maintain the Book Object.
    //the main method only cares about Book and get the bookName
    //type 2 use setter to set bookName property
    //type 3 use constructor to set bookName property
//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        Book book = (Book) applicationContext.getBean("book");
//        System.out.println(book.getBookName());
//
//        Book anotherBook = (Book) applicationContext.getBean("book2");
//        System.out.println(anotherBook.getBookName());
//    }


    //IOC Type 1
    //程式只關注 "有書名的事物" 並要求給他一個書名
    //在此程式只會面對到介面
    //不需依賴于book物件的實作，只關注於提供getBookName的結果
    //the main method only cares about a interface "hasBookName"
    //you don't need to care about who got a bookName.
    //just focus on the purpose "I want something whatever but has a bookName"
//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        HasBookName hasBookName = (HasBookName) applicationContext.getBean("hasBookName");
//        System.out.println(hasBookName.getBookName());
//    }


}
