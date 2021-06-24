package com.jw.firstapp.design_mode.factory_mode;

import android.widget.Switch;

import com.jw.firstapp.design_mode.simple_factory_mode.Food;
import com.jw.firstapp.design_mode.simple_factory_mode.HuangmenChichen;
import com.jw.firstapp.design_mode.simple_factory_mode.LanzhouNoddle;

public class LanzhouFactory implements FoodFactory{

    @Override
    public Food makeFood() {
        Food lanzhouNoddle = new LanzhouNoddle();
        return lanzhouNoddle;
    }

}
