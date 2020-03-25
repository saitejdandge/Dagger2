package com.example.dagger2.Dagger;

import com.example.dagger2.Entities.Engine;
import com.example.dagger2.Entities.EnginePackage.DieselEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    public Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}
