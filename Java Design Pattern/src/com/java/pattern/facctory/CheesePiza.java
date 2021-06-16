package com.java.pattern.facctory;

public class CheesePiza implements Pizza{


    @Override
    public void prepare() {
        System.out.println("prepare CheesePizza ");
    }

    @Override
    public void cut() {
        System.out.println("Cut CheesePizza ");
    }

    @Override
    public void bake() {
        System.out.println("Bake CheesePizza ");
    }
}
