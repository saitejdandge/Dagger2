package com.example.dagger2.Dagger;

import com.example.dagger2.Entities.Engine;
import com.example.dagger2.Entities.EnginePackage.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {
    @Provides
    Engine providesPetrolEngine(PetrolEngine petrolEngine) {
        return petrolEngine;
    }
}
