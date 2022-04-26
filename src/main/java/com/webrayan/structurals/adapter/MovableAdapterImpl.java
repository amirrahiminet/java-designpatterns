package com.webrayan.structurals.adapter;

public class MovableAdapterImpl implements MovableAdapter {
    Movable car;

    public MovableAdapterImpl(Movable car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return car.getSpeed()*1.60934;
    }


}
