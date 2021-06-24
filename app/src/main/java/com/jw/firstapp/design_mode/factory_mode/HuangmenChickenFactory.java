package com.jw.firstapp.design_mode.factory_mode;

import com.jw.firstapp.design_mode.simple_factory_mode.Food;
import com.jw.firstapp.design_mode.simple_factory_mode.HuangmenChichen;

public class HuangmenChickenFactory implements FoodFactory {

    @Override
    public Food makeFood() {
        Food food = new HuangmenChichen();
        return food;
    }

}
