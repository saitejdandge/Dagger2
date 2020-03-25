package com.example.dagger2.Dagger;

import com.example.dagger2.Entities.Engine;
import com.example.dagger2.Entities.EnginePackage.DieselEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    public abstract Engine bindEngine(DieselEngine dieselEngine);
}
