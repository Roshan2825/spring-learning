package com.karthick;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer{

    public Pen() {
        System.out.println("pen constructor");
    }

    @Override
    public void write() {
        System.out.println("writing using pen!");
    }
}
