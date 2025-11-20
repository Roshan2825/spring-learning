package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {   
        ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
       
        Student student1=(Student)context.getBean("student");
        student1.study();
        //student1.setAge(10);    
        System.out.println(student1.getAge()+" "+student1.getRno());
    }
}
