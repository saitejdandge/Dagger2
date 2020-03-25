package com.example.dagger2.Dagger.Components;

import com.example.dagger2.Dagger.DriverModule;
import com.example.dagger2.Entities.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {DriverModule.class})
public interface AppComponent {
    Driver getDriver();


}
