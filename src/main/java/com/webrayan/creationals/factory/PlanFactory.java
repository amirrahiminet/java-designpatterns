package com.webrayan.creationals.factory;

public class PlanFactory {
    public Plan getPlan(String type){
        if (type==null)
            return null;
        if (type.equalsIgnoreCase("A"))
            return new PlanA();
        else if (type.equalsIgnoreCase("B"))
            return new PlanB();
        else if (type.equalsIgnoreCase("C"))
            return new PlanC();
        return null;
    }
}
