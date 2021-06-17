package com.java.pattern.facctory.example;

public class Test {

public static void main(String[] args) {

    Persone per=PersonFactotry.createPerson("male");
    per.wish("");

}
}
