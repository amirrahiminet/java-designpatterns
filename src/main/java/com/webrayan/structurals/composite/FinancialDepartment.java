package com.webrayan.structurals.composite;

public class FinancialDepartment implements Department{
    private Integer id;
    private String name;

    public void printDepartmentName() {
        System.out.println("Financial Dep");
    }
}
