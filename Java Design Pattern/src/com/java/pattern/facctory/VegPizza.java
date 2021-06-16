package com.java.pattern.facctory;

public class VegPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare VegPizza ");
    }

    @Override
    public void cut() {
        System.out.println("cut VegPizza ");
    }

    @Override
    public void bake() {
        System.out.println("bake VegPizza ");
    }
}
