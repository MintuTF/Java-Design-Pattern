package com.java.pattern.facctory;

public class PizzaFactory {

    public static Pizza createPizza(String value){
        Pizza p=null;

        if(value.equals("Cheese")){
            p=new CheesePiza();
        }
        if(value.equals("VegPizza")){
            p=new VegPizza();
        }
        return p;
    }
}
