package com.jw.firstapp.java_base;

public class GenericClass<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void checkT(){
        if (t instanceof Integer){
            System.out.println("t is Integer");
        }
    }

}
