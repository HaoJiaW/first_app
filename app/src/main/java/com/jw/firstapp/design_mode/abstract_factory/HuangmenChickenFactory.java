package com.jw.firstapp.design_mode.abstract_factory;

import com.jw.firstapp.design_mode.simple_factory_mode.Food;
import com.jw.firstapp.design_mode.simple_factory_mode.HuangmenChichen;

public class HuangmenChickenFactory extends RestaurantFactory {

    @Override
    public Food makeFood() {
        Food huangmenChicken = new HuangmenChichen();
        return huangmenChicken;
    }

    @Override
    public Soup makeSoup() {
        Soup soup = new HuangmenChickenSoup();
        return soup;
    }
}
