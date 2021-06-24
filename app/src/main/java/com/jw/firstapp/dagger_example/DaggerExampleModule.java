package com.jw.firstapp.dagger_example;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DaggerExampleModule {

    @Binds
    public abstract DaggerExampleContract.Model bindsDaggerExampleModel(DaggerExampleModel model);


}
