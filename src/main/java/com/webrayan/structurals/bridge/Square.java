package com.webrayan.structurals.bridge;

public class Square extends Shape{


    public Square(Color color) {
        super(color);
    }

    @Override
    public String darw() {
        return "Square drawn ." + color.fill();
    }
}
