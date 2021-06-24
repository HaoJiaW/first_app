package com.jw.firstapp.dagger_example;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Module;

public class DaggerExamplePresenter {

    @Inject
    DaggerExampleContract.Model model;

    DaggerExampleContract.View view;

    @Inject
    public DaggerExamplePresenter(@Named("View2") DaggerExampleContract.View view){
        this.view = view;
    }

    public void updateUI(){
        view.updateUI(model.getText());
    }

}
