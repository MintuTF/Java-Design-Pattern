package com.java.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable,Cloneable {

private static DateUtil instance;

// eager initialization
static {
    instance=new DateUtil();
}
    private DateUtil(){

    }


    // lazy initialization
    public static synchronized DateUtil getInstance(){

    if(instance==null){
        synchronized(DateUtil.class){
            if(instance==null){
                instance=new DateUtil();
            }
        }
    }


        return instance;
    }

    // to resolve serializable problem
    private Object readResolve(){
    return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
    throw new CloneNotSupportedException();
    }
}
