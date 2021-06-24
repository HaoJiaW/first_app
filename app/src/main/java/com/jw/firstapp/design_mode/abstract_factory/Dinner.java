package com.jw.firstapp.design_mode.abstract_factory;

import com.jw.firstapp.design_mode.simple_factory_mode.Food;

public class Dinner {

    private Food food;
    private Soup soup;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Soup getSoup() {
        return soup;
    }

    public void setSoup(Soup soup) {
        this.soup = soup;
    }

    public Dinner(Food food, Soup soup) {
        this.food = food;
        this.soup = soup;
    }
}
