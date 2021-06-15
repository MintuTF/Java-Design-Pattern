package com.java.singleton;

public class DateUtil {
private static DateUtil instance;
    private DateUtil(){

    }


    // lazy init
    public static DateUtil getInstance(){
        if(instance==null){
            instance=new DateUtil();
        }
        return instance;
    }
}
