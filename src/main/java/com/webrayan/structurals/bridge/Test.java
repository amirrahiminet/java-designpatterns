package com.webrayan.structurals.bridge;

public class Test {

    private static void test1(){

    }

    public static void main(String[] args) {
        Color color=new Red();
        Shape shape=new Square(color);
        
        System.out.println(shape.darw());
        color=new Blue();
        shape=new Circle(color);
        System.out.println(shape.darw());

    }
}
