package designPattern;

import java.util.HashMap;
import java.util.Map;

public class Son extends Father {

    public void fun(Map map){
        System.out.println("子类被执行...");
    }

    @Override
    public HashMap fun2() {
        return null;
    }
}
