package com.java.pattern.facctory;

public class PizzaStore {



    public Pizza orederPizza(String value){
        Pizza p=PizzaFactory.createPizza(value);

        p.prepare();
        p.cut();
        p.bake();



        return p;
    }
}
