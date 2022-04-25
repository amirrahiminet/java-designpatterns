package com.webrayan.structurals.bridge;

public class Circle extends Shape{


    public Circle(Color color) {
        super(color);
    }

    @Override
    public String darw() {
        return "Circle drawn ." + color.fill();
    }
}
