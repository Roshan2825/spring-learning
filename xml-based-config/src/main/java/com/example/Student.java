package com.example;

public class Student {
    private int age;
    private int rno;
    //Pen pen=new Pen();
    //private Pen pen;
    private Writer writer;

    
    
    
    // public int getAge(){return this.age;} 
    // public void setAge(int age){ System.out.println("called setter");this.age=age;}
    

    public Student(int age, int rno, Writer writer) {
        System.out.println("para constructor called");
        this.age = age;
        this.rno = rno;
        this.writer = writer;
    }

    public Student() {
    }


    public void study() {
        System.out.println("Student is studying.");
    }
    // public int getRno() {
    //     return rno;
    // }
    // public void setRno(int rno) {
    //     this.rno = rno;
    //}
    public void writeExam() {
        writer.write();
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
}
