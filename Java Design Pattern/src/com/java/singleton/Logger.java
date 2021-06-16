package com.java.singleton;

import java.io.Serializable;

public class Logger implements Serializable,Cloneable {
    private static Logger instance;
    private Logger(){

    }

    public static Logger getInstance(){
        if(instance==null){
            synchronized (Logger.class){
                if(instance==null){
                    instance=new Logger();
                }
            }
        }

    return instance;
    }

    public static void log(String msg){
        System.out.println(msg);
    }

    public Object readResolve(){
        return instance;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

}
