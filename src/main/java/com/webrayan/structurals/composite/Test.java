package com.webrayan.structurals.composite;

public class Test {
    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment();
        Department financialDepartment = new FinancialDepartment();

        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}
