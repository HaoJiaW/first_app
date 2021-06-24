package designPattern;

import java.util.HashMap;

public class Hello {

    public static void main(String[] args) {
        HashMap h = new HashMap();
//        Father f = new Father();
//        f.fun(h);

        Son s = new Son();
        s.fun(h);
    }

}
