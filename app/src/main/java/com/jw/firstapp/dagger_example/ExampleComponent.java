package com.jw.firstapp.dagger_example;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {DaggerExampleModule.class,DaggerExampleModule2.class})
public interface ExampleComponent {

    void inject(DaggerExampleActivity activity);


}
