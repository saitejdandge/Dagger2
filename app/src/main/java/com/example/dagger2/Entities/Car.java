package com.example.dagger2.Entities;

import android.util.Log;

import com.example.dagger2.ThirdParty.Wheels;

import javax.inject.Inject;

public class Car {
    private Engine engine;
    private Wheels wheels;
    private static final String TAG = "Car";

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "drive: zoom");
        Log.d(TAG, "engine " + engine.getClass());
        Log.d(TAG, "wheels " + wheels.getClass());

    }

    @Inject
    public void setRemote(Remote remote) {
        remote.setCar(this);
    }
}
