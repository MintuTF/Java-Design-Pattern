package com.java.pattern.facctory.example;

public class Male implements Persone{

    @Override
    public void wish(String value) {
        System.out.println("wish for Female");
    }
}
