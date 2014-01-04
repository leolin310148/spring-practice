package org.noteverything.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leolin on 2014/1/4.
 */
public class HelloSpringApp {

    //可以為一個Bean的屬性注入另一個Bean
    //寫法有兩種（見spring-config.xml）
    //一種是透過ref指向其他bean
    //另外一種是在property內再設定一個Bean
    //you can inject a bean to another bean's property
    //use ref="book" (which book is the id of first bean in the xml file)
    //or declare another bean inside the <property> tag
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring-config.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.getStudentName());
        System.out.println(student.getBook().getBookName());
        System.out.println("----");

        Student student2 = (Student) applicationContext.getBean("student2");
        System.out.println(student2.getStudentName());
        System.out.println(student2.getBook().getBookName());
    }

}
