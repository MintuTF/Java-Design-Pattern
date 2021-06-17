package com.java.pattern.facctory.example;

public class PersonFactotry {

public static Persone createPerson(String val){
    Persone p=null;
    if(val.equals("male")){
        p=new Male();
    }
    if(val.equals("female")){
        p=new Female();
    }

    return p;
}
}
