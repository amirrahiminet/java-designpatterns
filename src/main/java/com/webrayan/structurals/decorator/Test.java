package com.webrayan.structurals.decorator;

public class Test {

    public static void main(String[] args) {
        ChristmasTree tree1 = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(tree1.decorate());

        ChristmasTree tree2 = new Tinsel(new ChristmasTreeImpl());
        System.out.println(tree2.decorate());
    }
}
