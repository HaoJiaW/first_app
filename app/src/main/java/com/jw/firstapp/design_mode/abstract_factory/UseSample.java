package com.jw.firstapp.design_mode.abstract_factory;

import com.jw.firstapp.design_mode.simple_factory_mode.Food;

public class UseSample  {

    public static void main(String[] args) {
        RestaurantFactory restaurantFactory = new HuangmenChickenFactory();
        Food food = restaurantFactory.makeFood();
        Soup soup = restaurantFactory.makeSoup();
        Dinner dinner = new Dinner(food,soup);
        System.out.println("dinner,food:"+dinner.getFood().getDesc()+";soup:"+dinner.getSoup().getDesc());
    }

}
