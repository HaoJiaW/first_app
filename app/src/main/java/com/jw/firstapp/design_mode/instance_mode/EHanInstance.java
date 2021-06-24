package com.jw.firstapp.design_mode.instance_mode;

/**
 * 饿汉式
 */
public class EHanInstance {

    private EHanInstance(){

    }

    private static EHanInstance instance = new EHanInstance();

    public static EHanInstance getInstance() {
        return instance;
    }

}
