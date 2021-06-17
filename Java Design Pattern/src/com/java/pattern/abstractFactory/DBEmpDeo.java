package com.java.pattern.abstractFactory;

public class DBEmpDeo implements Deo {
    @Override
    public void save() {
        System.out.println("Save emp to DB");
    }
}
