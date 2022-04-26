package com.webrayan.structurals.decorator;

public class Tinsel extends TreeDecorator{

    public Tinsel(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithTinsel();
    }

    private String decorateWithTinsel() {
        return " with Tinsel";
    }
}
