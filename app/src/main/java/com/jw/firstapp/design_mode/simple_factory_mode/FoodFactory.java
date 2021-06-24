package com.jw.firstapp.design_mode.simple_factory_mode;

public class FoodFactory {

    /**
     * 简单来说，输入一个参数输入出一个产品。
     * @param name
     * @return
     */
    public static Food makeFood(String name){
        switch (name){
            case "LanzhouNoddle":
                Food lanzouNoddle = new LanzhouNoddle();
                return lanzouNoddle;
            case "HuangmenChicken":
                Food huangmenChicken = new HuangmenChichen();
                return huangmenChicken;
            default:
                return null;
        }
    }


}
