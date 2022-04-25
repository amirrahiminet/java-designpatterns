package com.webrayan.structurals.adapter;

public class CarAdapterImpl implements CarAdapter{
    Car car;

    public CarAdapterImpl(Car car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return car.getSpeed()*1.60934;
    }


}
