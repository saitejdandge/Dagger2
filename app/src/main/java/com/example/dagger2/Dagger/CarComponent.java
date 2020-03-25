package com.example.dagger2.Dagger;

import com.example.dagger2.Entities.Car;

import dagger.Component;

@Component()
public interface CarComponent {
    Car getCar();
}
