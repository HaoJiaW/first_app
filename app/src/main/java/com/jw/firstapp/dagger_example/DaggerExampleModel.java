package com.jw.firstapp.dagger_example;

import javax.inject.Inject;

public class DaggerExampleModel implements DaggerExampleContract.Model {

    @Inject
    public DaggerExampleModel(){

    }

    @Override
    public String getText() {
        return "Dagger2 Hello";
    }
}
