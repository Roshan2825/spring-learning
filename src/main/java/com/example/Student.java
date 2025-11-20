package com.example;

public class Student {
    int age;
    int rno;

    
    
    public int getAge(){return this.age;} 
    public void setAge(int age){ System.out.println("called setter");this.age=age;}

    public Student() {
        System.out.println("Student object created.");
    }

    public void study() {
        System.out.println("Student is studying.");
    }
    public int getRno() {
        return rno;
    }
    public void setRno(int rno) {
        this.rno = rno;
    }
}
