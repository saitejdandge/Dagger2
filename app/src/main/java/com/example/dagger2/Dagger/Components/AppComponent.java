package com.example.dagger2.Dagger.Components;

import com.example.dagger2.Dagger.DieselEngineModule;
import com.example.dagger2.Dagger.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {DriverModule.class})
public interface AppComponent {
    CarComponent getCarCcomponent(DieselEngineModule dieselEngineModule);


}
