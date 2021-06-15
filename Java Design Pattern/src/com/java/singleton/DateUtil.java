package com.java.singleton;

public class DateUtil {
private static DateUtil instance;

// eager initialization
static {
    instance=new DateUtil();
}
    private DateUtil(){

    }


    // lazy initialization
    public static synchronized DateUtil getInstance(){
        synchronized(DateUtil.class){
            if(instance==null){
                instance=new DateUtil();
            }
        }

        return instance;
    }
}
