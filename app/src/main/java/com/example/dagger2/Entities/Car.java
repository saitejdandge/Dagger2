package com.example.dagger2.Entities;

import android.util.Log;

import com.example.dagger2.Dagger.Scopes.PerActivity;
import com.example.dagger2.ThirdParty.Wheels;

import javax.inject.Inject;

@PerActivity
public class Car {
    private Driver driver;
    private Engine engine;
    private Wheels wheels;
    private static final String TAG = "Car";

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.engine = engine;
        this.driver = driver;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "drive: zoom");
        Log.d(TAG, "engine " + engine.getClass());
        Log.d(TAG, "wheels " + wheels.getClass());
        Log.d(TAG, "driver " + driver + " drives " + this);

    }

    @Inject
    public void setRemote(Remote remote) {
        remote.setCar(this);
    }
}
