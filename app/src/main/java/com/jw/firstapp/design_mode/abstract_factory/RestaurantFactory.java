package com.jw.firstapp.design_mode.abstract_factory;

import com.jw.firstapp.design_mode.simple_factory_mode.Food;

public abstract class RestaurantFactory {
    public abstract Food makeFood();
    public abstract Soup makeSoup();
}
