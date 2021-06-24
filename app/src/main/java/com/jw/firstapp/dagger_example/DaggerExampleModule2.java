package com.jw.firstapp.dagger_example;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DaggerExampleModule2 {


    private  DaggerExampleContract.View view;

    public DaggerExampleModule2(DaggerExampleContract.View view){
        this.view = view;
    }

    @Singleton
    @Provides
    @Named("View1")
    public DaggerExampleContract.View provideView(){
        System.out.println("Create View1");
        return this.view;
    }


    @Singleton
    @Provides
    @Named("View2")
    public DaggerExampleContract.View provideView2(){
        System.out.println("Create View2");
        return this.view;
    }


}
