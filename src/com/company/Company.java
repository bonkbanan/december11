package com.company;

public class Company {
    private String name;
    private Company chief;
    private int employeeAmount;

    public Company() {
    }

    public Company(String name, Company chief, int employeeAmount) {
        this.name = name;
        this.chief = chief;
        this.employeeAmount = employeeAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getChief() {
        return chief;
    }

    public void setChief(Company chief) {
        this.chief = chief;
    }

    public int getEmployeeAmount() {
        return employeeAmount;
    }

    public void setEmployeeAmount(int employeeAmount) {
        this.employeeAmount = employeeAmount;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", chief=" + chief +
                ", employeeAmount=" + employeeAmount +
                '}';
    }
}
