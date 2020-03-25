package com.example.dagger2.Dagger;

import com.example.dagger2.Entities.Driver;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Provides
    static Driver provideDriver() {
        return new Driver();
    }
}
