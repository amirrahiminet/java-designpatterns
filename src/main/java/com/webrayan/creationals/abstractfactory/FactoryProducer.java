package com.webrayan.creationals.abstractfactory;

public class FactoryProducer {
    public static AbstractShapeFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
