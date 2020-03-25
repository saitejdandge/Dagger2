package com.example.dagger2.Entities;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    @Inject
    public Engine engine;
    private Wheels wheels;
    private static final String TAG = "Car";

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "drive: zoom");
    }

    @Inject
    public void setRemote(Remote remote) {
        remote.setCar(this);
    }
}
