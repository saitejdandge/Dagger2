package com.example.dagger2.Dagger;

import com.example.dagger2.Entities.Car;
import com.example.dagger2.MainActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
