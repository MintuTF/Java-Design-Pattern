package com.java.pattern.abstractFactory;

public class XMLDepartDeo implements Deo {
    @Override
    public void save() {
        System.out.println("Save depart to xml");
    }
}
