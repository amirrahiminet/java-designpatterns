package com.webrayan.creationals.builder;

public class Test {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder=new ComputerBuilder("500 G","16 G");
        Computer computer=computerBuilder.build();
        System.out.println(computer.toString());

        ComputerBuilder computerBuilder2=new ComputerBuilder("1000 G","32 G",true,true);
        Computer computer2=computerBuilder2.build();
        System.out.println(computer2.toString());
    }
}
