package com.example.dagger2.Dagger;

import com.example.dagger2.Entities.Engine;
import com.example.dagger2.Entities.EnginePackage.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    public abstract Engine bindEngine(PetrolEngine petrolEngine);
}
