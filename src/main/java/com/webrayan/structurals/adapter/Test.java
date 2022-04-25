package com.webrayan.structurals.adapter;

public class Test {
    public static void main(String[] args) {
        Car car=new BugattiVeyron();
        System.out.println("Speed mph : " + car.getSpeed());
        CarAdapter carAdapter=new CarAdapterImpl(car);
        System.out.println("Speed kmh : "+ carAdapter.getSpeed());
    }
}
