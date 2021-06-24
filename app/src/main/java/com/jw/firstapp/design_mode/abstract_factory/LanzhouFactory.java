package com.jw.firstapp.design_mode.abstract_factory;

import com.jw.firstapp.design_mode.simple_factory_mode.Food;
import com.jw.firstapp.design_mode.simple_factory_mode.LanzhouNoddle;

public class LanzhouFactory extends RestaurantFactory {

    @Override
    public Food makeFood() {
        Food food = new LanzhouNoddle();
        return food;
    }

    @Override
    public Soup makeSoup() {
        Soup soup = new LanzhouNoddleSoup();
        return soup;
    }
}
