package designPattern;

import java.util.HashMap;
import java.util.Map;

public abstract class Father {

    public void fun(HashMap map){
        System.out.println("父类被执行...");
    }

    public abstract Map fun2();

}
