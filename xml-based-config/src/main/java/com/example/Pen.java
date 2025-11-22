package com.example;

public class Pen implements Writer {
    @Override
    public void write() {
        System.out.println("Writing with the pen.");
    }
}
