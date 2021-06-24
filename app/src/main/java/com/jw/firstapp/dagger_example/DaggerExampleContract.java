package com.jw.firstapp.dagger_example;

public interface DaggerExampleContract {

    interface View{

        void updateUI(String text);

    }

    interface Model{

        String getText();

    }

}
