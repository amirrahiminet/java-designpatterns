package com.webrayan.creationals.factory;

public class Test {
    public static void main(String[] args) {
        PlanFactory planFactory=new PlanFactory();
        Plan p1=planFactory.getPlan("A");
        Plan p2=planFactory.getPlan("B");
        Plan p3=planFactory.getPlan("C");

        p1.getRate();
        p1.calculateBill(10);

        p2.getRate();
        p2.calculateBill(10);

        p3.getRate();
        p3.calculateBill(10);

    }
}
