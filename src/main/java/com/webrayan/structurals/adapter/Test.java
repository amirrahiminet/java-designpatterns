package com.webrayan.structurals.adapter;

public class Test {
    public static void main(String[] args) {
        Movable car=new BugattiVeyron();
        System.out.println("Speed mph : " + car.getSpeed());
        MovableAdapter carAdapter=new MovableAdapterImpl(car);
        System.out.println("Speed kmh : "+ carAdapter.getSpeed());
    }
}
