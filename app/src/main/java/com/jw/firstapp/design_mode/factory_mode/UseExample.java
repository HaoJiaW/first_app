package com.jw.firstapp.design_mode.factory_mode;

import com.jw.firstapp.design_mode.simple_factory_mode.Food;

public class UseExample {

    public static void main(String[] args) {
        FoodFactory foodFactory = new LanzhouFactory();
        Food food = foodFactory.makeFood();
        System.out.println(food.getDesc());
    }

}
