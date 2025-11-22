package com.karthick;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil implements Writer{
    public Pencil() {
        System.out.println("pencil constructor");
    }
    @Override
    public void write() {
        System.out.println("writing using pencil");
    }
}
