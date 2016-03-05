package org.noteverything.practice;

/**
 * Created by leolin on 2014/1/4.
 */
public class HelloSpringApp {

    //傳統的Java Bean使用方式
    //General way using Java Bean
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("This is a Java book");
        System.out.println(book.getBookName());
        System.out.println("testTest");
    }


    //透過xml檔設定讓spring幫你產生book這個物件，並同時協助你設定book的bookName
    //set the book Bean from spring-config.xml
    //get the book Bean from applicationContext and use it.
//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        Book book = applicationContext.getBean(Book.class);
//        System.out.println(book.getBookName());
//    }

    //另一種取得Bean的方式，是根據<bean id="book" ...  的id來取得指定的Bean
    //get the book Bean By the "id" defined in the spring-config.xml
//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        Book book = (Book) applicationContext.getBean("book");
//        System.out.println(book.getBookName());
//
//        Book anotherBook = (Book) applicationContext.getBean("book2");
//        System.out.println(anotherBook.getBookName());
//    }

}
