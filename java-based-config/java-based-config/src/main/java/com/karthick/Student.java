package com.karthick;




import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {
    private int rno;
    private Writer writer;



    public Student() {
        System.out.println("student constructor");
    }
    @Autowired
    public Student(@Qualifier("pencil") Writer writer) {
        this.writer = writer;
    }

    public void show(){
        System.out.println("heyyyyy...");
    }
    public void writeExam(){
        writer.write();
    }
}
