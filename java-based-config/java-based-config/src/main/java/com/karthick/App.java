package com.karthick;

import com.karthick.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Student st = (Student) context.getBean(Student.class);
        System.out.println(st);
    }

}
