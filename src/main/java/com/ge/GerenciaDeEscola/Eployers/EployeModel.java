package com.ge.GerenciaDeEscola.Eployers;

import com.ge.GerenciaDeEscola.AbstractClasses.Human;

public class EployeModel extends Human{
    private String office;
    private double salary;

    public EployeModel(String name, int age, String office, double salary) {
        super(name, age);
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}
