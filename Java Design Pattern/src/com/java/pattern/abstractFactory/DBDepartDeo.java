package com.java.pattern.abstractFactory;

public class DBDepartDeo implements Deo {
    @Override
    public void save() {
        System.out.println("Save depart to DB");
    }
}
